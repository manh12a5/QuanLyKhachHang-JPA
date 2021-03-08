package service;

import java.util.List;

public interface IService<E> {

    List<E> findAll();

    E findById(int id);

    void save(E e);

    void remove(int id);

}
