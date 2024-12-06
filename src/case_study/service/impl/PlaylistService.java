package case_study.service.impl;

import case_study.entity.Playlist;
import case_study.repository.PlaylistRepository;
import case_study.service.IPlaylistService;

import java.util.List;

public class PlaylistService implements IPlaylistService {
    private PlaylistRepository playlistRepository;

    public PlaylistService() {
        this.playlistRepository = new PlaylistRepository();
    }
    @Override
    public void add(Playlist playlist) {
        if(playlistRepository.isIdExist(playlist.getId())){
            System.out.println("Danh sách phát với id " + playlist.getId() + " đã tồn tại.");
        }else{
            playlistRepository.add(playlist);
        }
    }

    @Override
    public void print() {
        List<Playlist> playlists = playlistRepository.getAll();
        if(playlists.isEmpty()){
            System.out.println("Danh sách phát rỗng.");
        }else{
            System.out.println("Danh Sách phát hiện tại : ");
            for (Playlist playlist : playlists) {
                System.out.println(playlist.getId() + ". " + playlist.getName());
            }
        }
    }

    @Override
    public boolean isIdExist(int id) {
        return false;
    }

    @Override
    public Playlist getById(int id) {
        return playlistRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        playlistRepository.getById(id);
        playlistRepository.delete(id);
    }

    @Override
    public List<Playlist> search(String name) {
        return List.of();
    }

    @Override
    public void edit(int id, Playlist playlist) {
    }

    @Override
    public void sortByNameThenId() {
    }

    @Override
    public void addSongInPlaylist(int idSong, int idPlaylist) {
        playlistRepository.addSongInPlaylist(idSong, idPlaylist);
    }
}
