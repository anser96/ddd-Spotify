package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SongName implements ValueObject<String>{
    private final String value;

    public SongName(String value){
        this.value = Objects.requireNonNull(value);

    }

    public String value() {
        return value;
    }

}
