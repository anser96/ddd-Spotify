package co.com.sofka.playlist.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PodCastEpisodios implements ValueObject<PodCastEpisodios> {

    private final PodCastEpisodios value;

    public PodCastEpisodios(PodCastEpisodios value){
        this.value = Objects.requireNonNull(value);

    }

    public PodCastEpisodios value() {
        return value;
    }
}
