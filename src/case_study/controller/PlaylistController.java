package case_study.controller;

import case_study.entity.Playlist;
import case_study.service.IPlaylistService;
import case_study.service.impl.PlaylistService;

public class PlaylistController {
//    private IService<Playlist> playlistService;

    private IPlaylistService playlistService;

    public PlaylistController() {
        this.playlistService = new PlaylistService();
    }

    public void add(Playlist playlist) {
        playlistService.add(playlist);
    }

    public void print(){
        playlistService.print();
    }

    public boolean isIdExist(int id) {
        return playlistService.isIdExist(id);
    }

    public Playlist getById(int id) {
        return playlistService.getById(id);
    }

    public void addSongInPlaylist(int idSong, int idPlaylist) {
        playlistService.addSongInPlaylist(idSong, idPlaylist);
    }

    public void delete(int id) {
        playlistService.delete(id);
    }

}
