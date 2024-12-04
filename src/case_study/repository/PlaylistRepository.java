package case_study.repository;

import case_study.entity.Playlist;
import case_study.entity.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlaylistRepository {
  /*  private List<Playlist> playlists;

    private static final String FILE_PATH = "src/case_study/data/playlistData.csv";

    public PlaylistRepository() {
        playlists = new ArrayList<>();
    }

    public void addPlaylisst(Playlist playlist) {
        try(FileWriter fileWriter = new FileWriter(FILE_PATH, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(playlist.getId() + "," + playlist.getName() + "," + playlist.getSongs());
            bufferedWriter.newLine();
        }catch(IOException e){
            System.out.println("Lỗi khi thêm danh sách phát vào file.");
        }
        playlists.add(playlist);
    }

    public List<Playlist> getAllPlaylist() {
        List<Playlist> playlistFromFile = new LinkedList<>();
        File file = new File(FILE_PATH);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                int playlistId = Integer.parseInt(data[0].trim());
                String playlistName = data[1].trim();

                String[] songData = data[2].split(";");
                List<Song> songList = new ArrayList<>();
                for (String songInfo : songData) {
                    String[] songDetails = songInfo.split(":");
                    int songId = Integer.parseInt(songDetails[0].trim());
                    String songName = songDetails[1].trim();
                    String singer = songDetails[2].trim();
                    String genre = songDetails[3].trim();
                    int releaseYear = Integer.parseInt(songDetails[4].trim());

                    Song song = new Song(songId, songName, singer, genre, releaseYear);
                    songList.add(song);
                }
                Playlist playlist = new Playlist(playlistId, playlistName, songList);
                playlistFromFile.add(playlist);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file danh sách phát.");
        }
        return playlistFromFile;
    }

    private void saveAll(List<Playlist> playlists) {
        File file = new File(FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Playlist playlist : playlists) {
                bufferedWriter.write(playlist.getId() + "," + playlist.getName() + "," + playlist.getSongs());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi danh sách phát vào file.");
        }
    }

    public Playlist getPlaylistById(int id){
        for(Playlist playlist : getAllPlaylist()){
            if(playlist.getId() == id){
                return playlist;
            }
        }
        return null;
    }*/






}
