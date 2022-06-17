package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

public class FullName implements ValueObject<FullName> {
    private final FullName value;

    public FullName(FullName value) {
        this.value = value;
    }


    public FullName value() {
        return value;
    }
}
