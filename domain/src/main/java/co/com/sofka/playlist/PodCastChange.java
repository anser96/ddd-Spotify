package co.com.sofka.playlist;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.playlist.events.CreatedPodCast;
import co.com.sofka.playlist.values.PodCastAutor;
import co.com.sofka.playlist.values.PodCastEpisodios;
import co.com.sofka.playlist.values.PodcasName;

public class PodCastChange extends EventChange {
    public PodCastChange(PodCast podCast){
        apply((CreatedPodCast event)->{
            podCast.podcasName = new PodcasName(event.getPodcasName());
            podCast.podCastAutor = new PodCastAutor(event.getPodCastAutor());
            podCast.podCastEpisodios = new PodCastEpisodios(event.getPodCastEpisodios());
        });
    }
}
