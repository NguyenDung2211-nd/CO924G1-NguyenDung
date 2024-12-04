package case_study.service;

import case_study.entity.Song;

import java.util.List;

public interface IService {
    void addSong(Song song);
    void printSong();
    boolean isIdExist(int id);
    Song getSongById(int id);
    void deleteSong(int id);
    List<Song> searchSong(String name);
    void editSong(int id, String name, String singer, String genre, int releaseYear);
    void sortByNameThenId();
}

