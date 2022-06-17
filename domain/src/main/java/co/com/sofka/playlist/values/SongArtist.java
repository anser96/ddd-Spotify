package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SongArtist implements ValueObject<String>{
    private final String value;

    public SongArtist(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String value() {
        return value;
    }

}
