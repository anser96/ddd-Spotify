package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PodcasName implements ValueObject<PodcasName> {

    private final PodcasName value;
    public PodcasName(PodcasName value){
        this.value = Objects.requireNonNull(value);

    }

    public PodcasName value() {
        return value;
    }
}
