package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AccountAsociate implements ValueObject<CuentaId> {
    private final CuentaId value;

    public AccountAsociate(CuentaId value){
        this.value = Objects.requireNonNull(value);

    }

    public CuentaId value() {
        return value;
    }
}