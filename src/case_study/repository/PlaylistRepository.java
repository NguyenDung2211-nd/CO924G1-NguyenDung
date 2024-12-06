package case_study.repository;

import case_study.entity.Playlist;
import case_study.entity.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlaylistRepository {
    private List<Playlist> playlists;

    private static final String FILE_PATH = "src/case_study/data/PlaylistData.csv";

    public PlaylistRepository() {
        playlists = new ArrayList<>();
    }


    public void add(Playlist playlist) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true);
             BufferedWriter buferedWriter = new BufferedWriter(fileWriter)) {
            buferedWriter.write(playlist.getId() + "," + playlist.getName());
            buferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi danh sách phát vào file.");
        }
        playlists.add(playlist);
        System.out.println("Tạo Danh sách phát thành công.");
    }

    public List<Playlist> getAll() {
        List<Playlist> playlistFromFile = new LinkedList<>();
        File file = new File(FILE_PATH);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Playlist playlist = new Playlist(Integer.parseInt(data[0]), data[1], getListIdSongs(data[2]));
                playlistFromFile.add(playlist);
            }

        } catch (IOException e) {
            System.out.println("Lỗi đọc danh sách phát vào file.");
        }
        return playlistFromFile;
    }

    public Playlist getById(int id) {
        List<Playlist> playlists = getAll();
        for (Playlist playlist : playlists) {
            if (playlist.getId() == id) {
                return playlist;
            }
        }
        return null;
    }

    public boolean isIdExist(int id) {
        for (Playlist playlist : getAll()) {
            if (playlist.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private void saveAll(List<Playlist> playlists) {
        File file = new File(FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Playlist playlist : playlists) {
                bufferedWriter.write(playlist.getId() + "," + playlist.getName() + "," + listIdSongToString(playlist.getSongs()));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi danh sách bài hát vào file.");
        }
    }

    public void addSongInPlaylist(int idSong, int idPlaylist) {
        Playlist playlist = getById(idPlaylist);
        playlist.getSongs().add(idSong);

        List<Playlist> playlists = getAll();
        for (int i = 0; i < playlists.size(); i++) {
            Playlist editPlaylist = playlists.get(i);
            if (playlist.getId() == editPlaylist.getId()) {
                playlists.set(i, playlist);
                break;
            }
        }
        saveAll(playlists);
    }

    private List<Integer> getListIdSongs(String listIdSong) {
        listIdSong = listIdSong.substring(1, listIdSong.length() - 1);

        String[] parts = listIdSong.split(";");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }
        return numbers;
    }

    private String listIdSongToString(List<Integer> listIdSong) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < listIdSong.size(); i++) {
            result.append(listIdSong.get(i));
            if (i < listIdSong.size() - 1) {
                result.append(";");
            }
        }
        result.append("]");
        return result.toString();
    }

    public void delete(int id) {
        List<Playlist> playlists = getAll();
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).getId() == id) {
                playlists.remove(i);
                break;
            }
        }
        saveAll(playlists);
        System.out.println("Xóa danh sách phát thành công.");
    }
}
