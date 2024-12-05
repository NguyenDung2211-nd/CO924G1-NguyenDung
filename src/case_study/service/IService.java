package case_study.service;

import case_study.entity.Song;

import java.util.List;

public interface IService<E> {
    void add(E song);
    void print();
    boolean isIdExist(int id);
    Song getById(int id);
    void delete(int id);
    List<E> search(String name);
    void edit(int id, E e);
    void sortByNameThenId();
}