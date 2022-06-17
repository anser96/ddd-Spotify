package co.com.sofka.playlist;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.events.NameChanged;
import co.com.sofka.playlist.events.PlaylistChange;
import co.com.sofka.playlist.events.PlaylistCreated;
import co.com.sofka.playlist.events.SongAsociated;
import co.com.sofka.playlist.values.*;

import java.util.List;
import java.util.Set;

public class Playlist extends AggregateEvent<PlaylistId> {

    public PlaylistName playlistName;
    public Set<Song> song;

    private Playlist(PlaylistId playlistId){
        super(playlistId);
        subscribe(new PlaylistChange(this));
    }

    public Playlist(PlaylistId entityId, PlaylistName playlistName) {
        super(entityId);
        subscribe(new PlaylistChange(this));
        appendChange(new PlaylistCreated(playlistName)).apply();
    }

    public static Playlist from(PlaylistId playlistId, List<DomainEvent> eventsBy) {
        var playlist = new Playlist(playlistId);
        eventsBy.forEach(playlist::applyEvent);
        return playlist;
    }

    public void addSong(SongFactory songFactory){
        songFactory.songs()
                .forEach(song ->
                        appendChange(
                                new SongAsociated(song.getSongGenre(), song.getSongComposer(), song.SongDuration(), song.SongAlbum(), song.songDate(), song.songArtist() )
                        ).apply()
                );
    }

    public void cambiarNombre(PlaylistName playlistName){
        appendChange(new NameChanged(playlistName)).apply();
    }

}
