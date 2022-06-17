package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.SongFactory;
import co.com.sofka.playlist.values.PlaylistId;


public class AgregateSong extends Command {
    private final SongFactory songFactory;
    private final PlaylistId playlistId;

    public AgregateSong(SongFactory songFactory, PlaylistId playlistId){
        this.songFactory = songFactory;
        this.playlistId = playlistId;
    }

    public SongFactory getSongFactory() { return songFactory; }

    public PlaylistId getPlaylistId() { return playlistId; }
}
