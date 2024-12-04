package case_study.service.impl;

import case_study.entity.Song;
import case_study.repository.SongRepository;
import case_study.service.ISongService;

import java.util.ArrayList;
import java.util.List;

public class SongService implements ISongService {
    private SongRepository songRepository;

    public SongService(){
        this.songRepository = new SongRepository();
    }

    @Override
    public void addSong(Song song){
        if(songRepository.isIdExist(song.getId())){
            System.out.println("Bài hát với id " + song.getId() + " đã tồn tại.");
        }else{
            songRepository.addSong(song);
            System.out.println("Thêm bài hát thành công.");
        }
    }

    @Override
    public void printSong(){
        List<Song> songs = songRepository.getAllSong();
        if(songs.isEmpty()){
            System.out.println("Danh sách bài hát rỗng.");
        }else{
            System.out.println("Danh Sách bài hát hiện tại : ");
            songs.forEach(System.out::println);
        }
    }

    @Override
    public void deleteSong(int id){
        Song song = songRepository.getSongById(id);
        if (song != null) {
            songRepository.deleteSong(id);
            System.out.println("Xóa sản phẩm thành công.");
        } else {
            System.out.println("Sản phẩm với ID " + id + " không tồn tại.");
        }
    }

    @Override
    public List<Song> searchSong(String name) {
        List<Song> result = new ArrayList<>();
        for (Song song : songRepository.getAllSong()) {
            if (song.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public void editSong(int id, String name, String singer, String genre, int releaseYear){
        songRepository.editSong(id, name, singer, genre, releaseYear);
    }

    @Override
    public void sortByNameThenId(){
        songRepository.sortByNameThenId();
        System.out.println("Sắp xếp bài hát theo tên (a-z) thành công.");
    }

    @Override
    public boolean isIdExist(int id){
        return songRepository.isIdExist(id);
    }

    @Override
    public Song getSongById(int id){
        return songRepository.getSongById(id);
    }
}
