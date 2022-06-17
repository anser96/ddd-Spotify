package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaId extends Identity {
    public CuentaId(String value){
        super(value);
    }

    public static CuentaId of(String value){
        return new CuentaId(value);
    }
}