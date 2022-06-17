package co.com.sofka.playlist.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.values.PodCastAutor;
import co.com.sofka.playlist.values.PodCastEpisodios;
import co.com.sofka.playlist.values.PodcasName;

public class CreatedPodCast extends DomainEvent {

    private final PodcasName podcasName;
    private final PodCastAutor podCastAutor;
    private final PodCastEpisodios podCastEpisodios;
    public CreatedPodCast(PodcasName podcasName, PodCastAutor podCastAutor, PodCastEpisodios podCastEpisodios) {
        super("client.PodCast");
        this.podcasName = podcasName;
        this.podCastAutor = podCastAutor;
        this.podCastEpisodios = podCastEpisodios;
    }

    public PodcasName getPodcasName(){
        return podcasName;
    }

    public PodCastAutor getPodCastAutor(){
        return podCastAutor;
    }

    public PodCastEpisodios getPodCastEpisodios(){
        return podCastEpisodios;
    }
}
