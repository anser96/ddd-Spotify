package co.com.sofka.playlist;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.events.PlaylistCreated;

import java.util.HashSet;
import java.util.Set;

public class PlaylistChange extends EventChange {
    public PlaylistChange(Playlist playlist){
        apply((PlaylistCreated event)->{
            playlist.playlistName = event.getPlaylistName();
            playlist.song = new HashSet<>();
        });
    }
}
