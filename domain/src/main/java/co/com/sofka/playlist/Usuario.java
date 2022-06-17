package co.com.sofka.playlist;

import co.com.sofka.Usuario.UsuarioChange;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.playlist.events.CreatedUser;
import co.com.sofka.playlist.values.CuentaId;
import co.com.sofka.playlist.values.Password;
import co.com.sofka.playlist.values.UserName;
import co.com.sofka.playlist.values.TypeAccount;

public class Usuario extends AggregateEvent<CuentaId> {

    protected CuentaId cuentaId;
    protected Password password;
    protected UserName userName;
    protected TypeAccount typeAccount;


    public Usuario(CuentaId entityId, Password password, UserName userName, TypeAccount typeAccount) {
        super(entityId);
        subscribe(new UsuarioChange(this));
        appendChange(new CreatedUser(userName, password, typeAccount, cuentaId));
    }
}
