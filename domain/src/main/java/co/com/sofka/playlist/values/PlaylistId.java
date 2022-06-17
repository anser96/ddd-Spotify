package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.Identity;

public class PlaylistId extends Identity {
    public PlaylistId(String value){
        super(value);
    }

    public static PlaylistId of(String value){
        return new PlaylistId(value);
    }
}
