package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.values.CuentaId;
import co.com.sofka.playlist.values.PlaylistName;
import co.com.sofka.playlist.values.SongId;

public class CreatePlaylist extends Command {

    private final CuentaId cuentaId;
    private final PlaylistName playlistName;


    public CreatePlaylist(PlaylistName playlistName,  CuentaId cuentaId){
        this.playlistName = playlistName;
        this.cuentaId = cuentaId;
    }


    public PlaylistName getPlaylistName(){
        return playlistName;
    }


    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
