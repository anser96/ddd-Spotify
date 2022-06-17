package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.Identity;

public class PodCastId extends Identity {
    private PodCastId(String value){
        super(value);
    }

    public static PodCastId of(String value){
        return new PodCastId(value);
    }
}
