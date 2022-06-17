package co.com.sofka.playlist.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.playlist.PodCast;
import co.com.sofka.playlist.values.PodCastAutor;
import co.com.sofka.playlist.values.PodCastEpisodios;
import co.com.sofka.playlist.values.PodcasName;


public class CreatePodCast extends Command {
    private final PodcasName podcasName;
    private final PodCastEpisodios podCastEpisodios;
    private final PodCastAutor podCastAutor;

    public CreatePodCast(PodcasName podcasName, PodCastAutor podCastAutor, PodCastEpisodios podCastEpisodios){
        this.podcasName = podcasName;
        this.podCastAutor = podCastAutor;
        this.podCastEpisodios = podCastEpisodios;
    }

    public PodCastAutor getPodCastAutor() {
        return podCastAutor;
    }

    public PodCastEpisodios getPodCastEpisodios() {
        return podCastEpisodios;
    }

    public PodcasName getPodcasName() {
        return podcasName;
    }
}
