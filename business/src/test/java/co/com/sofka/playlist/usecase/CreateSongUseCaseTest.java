package co.com.sofka.playlist.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.playlist.SongFactory;
import co.com.sofka.playlist.command.AgregateSong;
import co.com.sofka.playlist.events.PlaylistCreated;
import co.com.sofka.playlist.events.SongAsociated;
import co.com.sofka.playlist.usecases.CreateSongUseCase;
import co.com.sofka.playlist.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CreateSongUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CreateSongUseCase useCase;


    @Test
    void agregateSongToPlaylist(){
        //arrange
        SongFactory factory = SongFactory.getInstance()
                .add(SongId.of("1"), new SongName("la cucaracha"), new SongArtist("Alejandro Sanz"),
                        new SongDate("hoy"), new SongDuration("muy poco"), new SongAlbum("las ormigas"),
                        new SongGenre("pop"), new SongComposer("yo"));

        PlaylistId id = new PlaylistId();
        var command = new AgregateSong(factory, id);
        when(repository.getEventsBy(id.value())).thenReturn(history());
        useCase.addRepository(repository);


        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        Assertions.assertEquals(1, events.size());

    }

    private List<DomainEvent> history(){
        PlaylistName playlistName = new PlaylistName("variado");

        return List.of(
          new PlaylistCreated(playlistName),
          new SongAsociated(new SongGenre("prueba unitaria"),new  SongComposer("Alejandro Sanz"),
                  new SongDuration("muy poco"), new SongAlbum("las golondrinas"), new SongDate("hoy"),
                  new SongArtist(" songArtist")
          ));
    }
}
