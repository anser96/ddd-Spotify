package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.Identity;

public class SongId extends Identity {
    public SongId(String value){
        super(value);
    }

    public static SongId of(String value){
        return new SongId(value);
    }
}
