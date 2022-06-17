package co.com.sofka.playlist;

import co.com.sofka.playlist.values.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SongFactory {
    private final Set<Song> songs;
    private static SongFactory instance;

    private SongFactory(){
        songs = new HashSet<>();
    }

    public static SongFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new SongFactory();
            return instance;
        }
        return instance;
    }

    public SongFactory add(SongId entityId, SongName name, SongArtist artist, SongDate date,
                           SongDuration duration,SongAlbum album,SongGenre genero,SongComposer composer ){
        songs.add(new Song(entityId, name, artist, date,duration,album,genero,composer));
        return this;
    }

    protected Set<Song> songs() {
        return songs;
    }


}