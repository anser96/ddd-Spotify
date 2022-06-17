package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.PlaylistName;


public class PlaylistCreated extends DomainEvent {
    private final PlaylistName playlistName;



    public PlaylistCreated(PlaylistName playlistName) {
        super("co.com.sofka.playlist.events.playlistcreated");
        this.playlistName = playlistName;


    }

    public PlaylistName getPlaylistName(){
        return playlistName;
    }


}
