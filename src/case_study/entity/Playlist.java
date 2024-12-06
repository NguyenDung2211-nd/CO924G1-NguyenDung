package case_study.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private int id;
    private String name;
    private List<Integer> songs = new ArrayList<>();

    public Playlist(int id, String name, List<Integer> songs) {
        this.id = id;
        this.name = name;
        this.songs = songs;
    }

    public Playlist(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getSongs() {
        return songs;
    }

    public void setSongs(List<Integer> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Playlist(id = " + id + ", name = '" + name + "', songs = " + songs + ")";
    }
}

