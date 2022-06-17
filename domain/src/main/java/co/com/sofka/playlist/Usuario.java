package co.com.sofka.playlist;


import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.playlist.events.UserCreated;
import co.com.sofka.playlist.values.*;

public class Usuario extends AggregateEvent<CuentaId> {

    protected CuentaId cuentaId;
    protected FullName fullName;


    public Usuario(CuentaId entityId, FullName fullName) {
        super(entityId);
        subscribe(new UsuarioChange(this));
        appendChange(new UserCreated(fullName));
    }
}
