package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.PlaylistId;
import co.com.sofka.playlist.values.PlaylistName;

import java.lang.reflect.Field;

public class ChangeName extends Command {
    private final PlaylistId playlistId;
    private final PlaylistName playlistName;

    public ChangeName(PlaylistId playlistId, PlaylistName playlistName){
        this.playlistId=playlistId;
        this.playlistName =playlistName;
    }

    public PlaylistName getPlaylistName(){ return playlistName; }

    public PlaylistId getPlaylistId(){
        return playlistId;
    }
}
