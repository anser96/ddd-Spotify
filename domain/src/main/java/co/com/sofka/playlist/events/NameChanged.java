package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.PlaylistName;

public class NameChanged extends DomainEvent {
    private final PlaylistName playlistName;

    public NameChanged(PlaylistName playlistName){
        super("co.com.sofka.playlist.event.namechanged");
        this.playlistName = playlistName;
    }

    public PlaylistName getPlaylistName(){
        return playlistName;
    }
}
