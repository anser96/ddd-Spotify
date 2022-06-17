package co.com.sofka.playlist;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.playlist.values.*;

public class Song extends Entity<SongId> {
    protected SongName songName;

    protected SongArtist songArtist;
    protected SongDate songDate;
    protected SongDuration songDuration;
    protected SongAlbum songAlbum;
    protected SongGenre songGenre;
    protected SongComposer songComposer;

    public Song(SongId songId,SongName songName, SongArtist songArtist, SongDate songDate, SongDuration songDuration,
                SongAlbum songAlbum, SongGenre songGenre, SongComposer songComposer){

        super(songId);
        this.songName = songName;
        this.songArtist = songArtist;
        this.songDate = songDate;
        this.songDuration = songDuration;
        this.songAlbum = songAlbum;
        this.songGenre = songGenre;
        this.songComposer = songComposer;
    }

    public void ChangeArtist(SongArtist songArtist){
        this.songArtist = songArtist;
    }
    public SongArtist songArtist(){
        return songArtist;
    }
    public SongDate songDate(){
        return songDate;
    }
    public SongDuration SongDuration() { return songDuration; }
    public SongAlbum SongAlbum() { return songAlbum; }
    public SongGenre getSongGenre() { return songGenre; }
    public SongComposer getSongComposer() { return songComposer; }

}