package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

import java.util.Set;

public class PlaylistCreated extends DomainEvent {
    private final PlaylistName playlistName;

    private final SongId song;

    public PlaylistCreated(PlaylistName playlistName, SongId song) {
        super("co.com.sofka.playlist.events.playlistcreated");
        this.playlistName = playlistName;
        this.song =song;

    }

    public PlaylistName getPlaylistName(){
        return playlistName;
    }

    public SongId  getSong(){
        return  song;
    }
}
