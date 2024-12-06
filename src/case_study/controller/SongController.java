package case_study.controller;

import case_study.entity.Song;
import case_study.service.IService;
import case_study.service.impl.SongService;

import java.util.List;

public class SongController {
    private IService<Song> songService;

    public SongController(){
        this.songService = new SongService();
    }

    public void add(int id, String name, String singer, String genre, int releaseYear){
        Song song = new Song(id, name, singer, genre, releaseYear );
        songService.add(song);
    }

    public void print(){
        songService.print();
    }

    public void delete(int id){
        songService.delete(id);
    }

    public void search(String name) {
        List<Song> foundSong = songService.search(name);
        if (!foundSong.isEmpty()) {
            System.out.println("Tìm thấy " + foundSong.size() + " bài hát :");
            foundSong.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy bài hát.");
        }
    }

    public void edit(int id, String name, String singer, String genre, int releaseYear){
        Song song = new Song(id, name, singer, genre, releaseYear);
        songService.edit(id, song);
    }

    public void sortByNameThenId(){
        songService.sortByNameThenId();
    }

    public boolean isIdExist(int id) {
        return songService.isIdExist(id);
    }

    public Song getById(int id) {
        return songService.getById(id);
    }
}