package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.*;

public class SongAsociated extends DomainEvent{

    private final SongGenre songGenre;
    private final SongComposer songComposer;
    private final SongDuration songDuration;
    private final SongAlbum songAlbum;
    private final SongDate songDate;
    private final SongArtist songArtist;


    public SongAsociated(SongGenre songGenre, SongComposer songComposer, SongDuration songDuration, SongAlbum songAlbum, SongDate songDate, SongArtist songArtist) {
        super("song");
        this.songGenre = songGenre;
        this.songComposer = songComposer;
        this.songDuration = songDuration;
        this.songAlbum = songAlbum;
        this.songDate = songDate;
        this.songArtist = songArtist;
    }

    public SongGenre getSongGenre() {
        return songGenre;
    }

    public SongComposer getSongComposer() {
        return songComposer;
    }

    public SongDuration getSongDuration() {
        return songDuration;
    }

    public SongAlbum getSongAlbum() {
        return songAlbum;
    }

    public SongDate getSongDate() {
        return songDate;
    }

    public SongArtist getSongArtist() {
        return songArtist;
    }
}
