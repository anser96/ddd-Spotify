package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.Playlist;
import co.com.sofka.playlist.Song;
import co.com.sofka.playlist.values.SongId;

import java.util.Set;

public class PlaylistChange extends EventChange {
    public PlaylistChange(Playlist playlist){
        apply((PlaylistCreated event) ->{
            playlist.playlistName = event.getPlaylistName();
        });

        apply((NameChanged event)->{
            playlist.playlistName = event.getPlaylistName();
        });
    }
}
