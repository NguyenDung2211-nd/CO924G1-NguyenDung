package case_study.repository;

import case_study.entity.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SongRepository {
    private List<Song> songs;

    private static final String FILE_PATH ="src/case_study/data/songData.csv";

    public SongRepository() {
        songs = new ArrayList<>();
    }

    public void add(Song song){
        try(FileWriter fileWriter = new FileWriter(FILE_PATH, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(song.getId()+ ","+song.getName() + ","+ song.getSinger() + "," + song.getGenre() + "," + song.getReleaseYear());
            bufferedWriter.newLine();
        }catch(IOException e){
            System.out.println("Lỗi khi ghi bài hát vào file.");
        }
        songs.add(song);
    }

    public List<Song> getAll() {
        List<Song> songsFromFile = new LinkedList<>();
        File file = new File(FILE_PATH);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Song song = new Song(Integer.parseInt(data[0]), data[1], data[2], data[3], Integer.parseInt(data[4]));
                songsFromFile.add(song);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file bài hát.");
        }
        return songsFromFile;
    }

    public void delete(int id) {
        List<Song> songs = getAll();
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId() == id) {
                songs.remove(i);
                break;
            }
        }
        saveAll(songs);
        System.out.println("Xóa bài hát thành công.");
    }

    public void edit(Song editSong) {
        List<Song> songs = getAll();
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            if (song.getId() == editSong.getId()) {
                songs.set(i, editSong);
                break;
            }
        }
        saveAll(songs);
        System.out.println("Bài hát được sửa thành công.");
    }

    public void sortByNameThenId() {
        List<Song> songs = getAll();
        songs.sort((p1, p2) -> {
            int nameComparison = p1.getName().compareToIgnoreCase(p2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(p1.getId(), p2.getId());
        });
        saveAll(songs);
        System.out.println("Danh sách bài hát đã được sắp xếp theo tên (A-Z), nếu trùng tên thì sắp xếp theo ID.");
    }

    private void saveAll(List<Song> songs) {
        File file = new File(FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Song song : songs) {
                bufferedWriter.write(song.getId()+ ","+song.getName() + ","+ song.getSinger() + "," + song.getGenre() + "," + song.getReleaseYear());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi danh sách bài hát vào file.");
        }
    }

    public Song getById(int id){
        List<Song> songs = getAll();
        for (Song song: songs) {
            if (song.getId() == id) {
                return song;
            }
        }
        return null;
    }

    public boolean isIdExist(int id){
        for(Song song : getAll()){
            if(song.getId() == id ){
                return true;
            }
        }
        return false;
    }


}
