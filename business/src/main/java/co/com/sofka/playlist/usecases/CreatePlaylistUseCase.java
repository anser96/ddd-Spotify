package co.com.sofka.playlist.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.playlist.Playlist;
import co.com.sofka.playlist.command.CreatePlaylist;
import co.com.sofka.playlist.values.PlaylistId;

public class CreatePlaylistUseCase extends UseCase<RequestCommand<CreatePlaylist>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreatePlaylist> input) {
        var command = input.getCommand();
        var playlist = new Playlist(new PlaylistId(), command.getPlaylistName());
        emit().onResponse(new ResponseEvents(playlist.getUncommittedChanges()));
    }
}
