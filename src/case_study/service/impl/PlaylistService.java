package case_study.service.impl;

import case_study.entity.Playlist;
import case_study.service.IPlaylistService;

import java.util.List;

public class PlaylistService implements IPlaylistService {
    @Override
    public void add(Playlist song) {
    }

    @Override
    public void print() {
    }

    @Override
    public boolean isIdExist(int id) {
        return false;
    }

    @Override
    public Playlist getById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {
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
}
