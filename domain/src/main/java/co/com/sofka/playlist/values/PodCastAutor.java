package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PodCastAutor implements ValueObject<PodCastAutor> {

    private final PodCastAutor value;

    public PodCastAutor(PodCastAutor value){
        this.value = Objects.requireNonNull(value);

    }

    public PodCastAutor value() {
        return value;
    }
}
