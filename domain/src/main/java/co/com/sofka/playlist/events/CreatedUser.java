package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.CuentaId;
import co.com.sofka.playlist.values.Password;
import co.com.sofka.playlist.values.TypeAccount;
import co.com.sofka.playlist.values.UserName;

import java.util.UUID;

public class CreatedUser extends DomainEvent {

    private final UserName userName;
    private final Password password;
    private final TypeAccount typeAccount;
    private final CuentaId cuentaId;
    public CreatedUser(UserName userName, Password password, TypeAccount typeAccount, CuentaId cuentaId) {
        super("usuario");
        this.userName = userName;
        this.cuentaId = cuentaId;
        this.password= password;
        this.typeAccount =typeAccount;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }

    public Password getPassword() {
        return password;
    }

    public UserName getUserName() {
        return userName;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }
}
