package co.com.sofka.playlist;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.events.UserCreated;
import co.com.sofka.playlist.values.FullName;


public class UsuarioChange extends EventChange {

    public UsuarioChange(Usuario usuario){
        apply((UserCreated event)->{
            usuario.fullName = new FullName(event.getFullName());
        });
    }


}