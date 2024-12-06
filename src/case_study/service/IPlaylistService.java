package case_study.service;

import case_study.entity.Playlist;

public interface IPlaylistService extends IService<Playlist> {

    void addSongInPlaylist(int idSong, int idPlaylist);
}
