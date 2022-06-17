package co.com.sofka.playlist;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.Usuario;
import co.com.sofka.playlist.events.CreatedUser;


public class UsuarioChange extends EventChange {

    public UsuarioChange(Usuario usuario){
        apply((CreatedUser event)->{
            usuario.cuentaId = event.getCuentaId();
            usuario.password = event.getPassword();
            usuario.typeAccount = event.getTypeAccount();
            usuario.userName = event.getUserName();
        });
    }

}