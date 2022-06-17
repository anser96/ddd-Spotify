package co.com.sofka.playlist.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.playlist.Playlist;
import co.com.sofka.playlist.command.AgregateSong;

public class CreateSongUseCase extends UseCase<RequestCommand<AgregateSong>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregateSong> input){
        var command = input.getCommand();
        var playList = Playlist.from(command.getPlayListId(), repository().getEventsBy(command.getPlayListId().value()));

        playList.addSong(command.getSongFactory());

        emit().onResponse(new ResponseEvents(playList.getUncommittedChanges()));

    }
}
