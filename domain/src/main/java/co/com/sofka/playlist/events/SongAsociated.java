package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.*;

public class SongAsociated extends DomainEvent {

    private final SongId songId;
    private final SongName songName;
    private final SongDate songDate;
    private final SongArtist songArtist;
    private final SongAlbum songAlbum;
    private final SongComposer songComposer;
    private final SongDuration songDuration;
    private final SongGenre songGenre;

    public SongAsociated(SongId songId, SongGenre songGenre, SongName songName, SongDate songDate, SongArtist songArtist, SongAlbum songAlbum, SongComposer songComposer, SongDuration songDuration){
        super("co.com.sofka.playlist.songasociated");
        this.songId = songId;
        this.songName = songName;
        this.songDate = songDate;
        this.songArtist = songArtist;
        this.songAlbum = songAlbum;
        this.songComposer = songComposer;
        this.songDuration = songDuration;
        this.songGenre = songGenre;
    }

    public SongId getSongId(){
        return songId;
    }

    public SongAlbum getSongAlbum() {
        return songAlbum;
    }

    public SongArtist getSongArtist() {
        return songArtist;
    }

    public SongComposer getSongComposer() {
        return songComposer;
    }

    public SongDate getSongDate() {
        return songDate;
    }

    public SongDuration getSongDuration() {
        return songDuration;
    }

    public SongGenre getSongGenre() {
        return songGenre;
    }

    public SongName getSongName() {
        return songName;
    }
}
