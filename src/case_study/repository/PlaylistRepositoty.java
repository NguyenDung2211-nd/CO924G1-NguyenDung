package case_study.repository;

import case_study.entity.Playlist;
import case_study.entity.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlaylistRepositoty {
    private List<Playlist> playlists;

    private static final String FILE_PATH = "";

    public PlaylistRepositoty() {
        playlists = new ArrayList<>();
    }

    public void add(Playlist playlist) {
        try(FileWriter fileWriter = new FileWriter(FILE_PATH);){
            BufferedWriter buferedWriter = new BufferedWriter(fileWriter);
            buferedWriter.write(playlist.getId() +","+ playlist.getName() +","+ playlist.getSongs());
            buferedWriter.newLine();
        }catch(IOException e){
            System.out.println("Lỗi ghi danh sách phát vào file.");
        }
        playlists.add(playlist);
    }

  /*  public List<Playlist> getAll() {
        List<Playlist> playlistFromFile = new LinkedList<>();
        File file = new File(FILE_PATH);
        try(FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                Playlist playlist = new Playlist(Integer.parseInt(data[0]), data[1], data[2]);
                playlistFromFile.add(playlist);
            }

        }catch(IOException e){
            System.out.println("Lỗi đọc danh sách phát vào file.");
        }
    } */
}
