package case_study.controller;

import case_study.entity.Song;
import case_study.service.IService;
import case_study.service.impl.SongService;

import java.util.List;

public class SongController {
    private IService songService;

    public SongController(){
        this.songService = new SongService();
    }

    public void addSong(int id, String name, String singer, String genre, int releaseYear){
        Song song = new Song(id, name, singer, genre, releaseYear );
        songService.addSong(song);
    }

    public void printSong(){
        songService.printSong();
    }

    public void deleteSong(int id){
        songService.deleteSong(id);
    }

    public void searchSong(String name) {
        List<Song> foundSong = songService.searchSong(name);
        if (!foundSong.isEmpty()) {
            System.out.println("Tìm thấy " + foundSong.size() + " bài hát :");
            foundSong.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy bài hát.");
        }
    }

    public void editSong(int id, String name, String singer, String genre, int releaseYear){
        songService.editSong(id, name, singer, genre, releaseYear);
    }

    public void sortByNameThenId(){
        songService.sortByNameThenId();
    }

    public boolean isIdExist(int id) {
        return songService.isIdExist(id);
    }

    public Song getSongById(int id) {
        return songService.getSongById(id);
    }
}
