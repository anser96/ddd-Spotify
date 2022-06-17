package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.Playlist;

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
