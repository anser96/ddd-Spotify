package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.SongFactory;
import co.com.sofka.playlist.values.PlaylistId;



public class AgregateSong extends Command {
    private final PlaylistId playListId;
    private final SongFactory songFactory;

    public AgregateSong(SongFactory songFactory, PlaylistId playlist){
        this.playListId = playlist;
        this.songFactory = songFactory;
    }

    public SongFactory getSongFactory(){
        return songFactory;
    }

    public PlaylistId getPlayListId() { return playListId; }

}
