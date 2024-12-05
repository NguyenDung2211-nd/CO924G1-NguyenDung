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
    public void add(Song song){
        if(songRepository.isIdExist(song.getId())){
            System.out.println("Bài hát với id " + song.getId() + " đã tồn tại.");
        }else{
            songRepository.add(song);
            System.out.println("Thêm bài hát thành công.");
        }
    }

    @Override
    public void print(){
        List<Song> songs = songRepository.getAll();
        if(songs.isEmpty()){
            System.out.println("Danh sách bài hát rỗng.");
        }else{
            System.out.println("Danh Sách bài hát hiện tại : ");
            songs.forEach(System.out::println);
        }
    }

    @Override
    public void delete(int id){
         songRepository.getById(id);
         songRepository.delete(id);
    }

    @Override
    public List<Song> search(String name) {
        List<Song> result = new ArrayList<>();
        for (Song song : songRepository.getAll()) {
            if (song.getName().equalsIgnoreCase(name)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public void edit(int id, Song song){
        songRepository.edit(song);
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
    public Song getById(int id){
        return songRepository.getById(id);
    }
}
