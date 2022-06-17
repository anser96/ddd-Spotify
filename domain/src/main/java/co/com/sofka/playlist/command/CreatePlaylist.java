package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

import java.util.Set;

public class CreatePlaylist extends Command {

    private final PlaylistName playlistName;



    public CreatePlaylist(PlaylistName playlistName){
        this.playlistName = playlistName;
    }
    public PlaylistName getPlaylistName(){
        return playlistName;
    }

}
