package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.FullName;

public class UserCreated extends DomainEvent {

    private final FullName fullName;

    public UserCreated(FullName fullName){
        super("user");
        this.fullName = fullName;
   }

    public FullName getFullName() {
        return fullName;
    }
}
