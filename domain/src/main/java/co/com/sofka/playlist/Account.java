package co.com.sofka.playlist;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.playlist.values.CuentaId;

public class Account extends Entity<CuentaId> {
    public Account(CuentaId entityId) {
        super(entityId);
    }
}
