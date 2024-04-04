package org.jdbc.repository;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();
    T findById(String id);

    void save(T data);

    void update(String id, T data);

    void delete(String id);

}
