package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FullName implements ValueObject<FullName> {
    private final FullName value;

    public FullName(FullName value) {
        this.value = Objects.requireNonNull(value);
    }


    public FullName value() {
        return value;
    }
}
