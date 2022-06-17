package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SongDate implements ValueObject<String>{
    private final String value;

    public SongDate(String value){
        this.value = Objects.requireNonNull(value);

    }

    public String value() {
        return value;
    }

}
