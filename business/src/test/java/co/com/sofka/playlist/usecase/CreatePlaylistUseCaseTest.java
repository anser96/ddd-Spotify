package co.com.sofka.playlist.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.playlist.command.CreatePlaylist;
import co.com.sofka.playlist.events.PlaylistCreated;
import co.com.sofka.playlist.usecases.CreatePlaylistUseCase;
import co.com.sofka.playlist.values.PlaylistName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatePlaylistUseCaseTest {

    @Test
    void createPlaylist() {
        //arrange
        PlaylistName name = new PlaylistName("variado");


        var command = new CreatePlaylist(name);
        var usecase = new CreatePlaylistUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (PlaylistCreated) events.get(0);

        Assertions.assertEquals("variado", event.getPlaylistName().value());

    }
}
