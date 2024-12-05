package case_study.service;

import java.util.List;

public interface IService<E> {
    void add(E song);
    void print();
    boolean isIdExist(int id);
    E getById(int id);
    void delete(int id);
    List<E> search(String name);
    void edit(int id, E e);
    void sortByNameThenId();
}