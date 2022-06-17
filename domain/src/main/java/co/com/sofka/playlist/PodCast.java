package co.com.sofka.playlist;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.playlist.events.CreatedPodCast;
import co.com.sofka.playlist.values.PodCastAutor;
import co.com.sofka.playlist.values.PodCastEpisodios;
import co.com.sofka.playlist.values.PodCastId;
import co.com.sofka.playlist.values.PodcasName;

public class PodCast extends AggregateEvent<PodCastId> {

    protected PodcasName podcasName;
    protected PodCastAutor podCastAutor;
    protected PodCastEpisodios podCastEpisodios;


    public PodCast(PodCastId entityId, PodcasName podcasName, PodCastAutor podCastAutor, PodCastEpisodios podCastEpisodios) {
        super(entityId);
        subscribe(new PodCastChange(this));
        appendChange(new CreatedPodCast(podcasName,podCastAutor,podCastEpisodios));
    }
}
