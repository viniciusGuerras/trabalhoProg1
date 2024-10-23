package main.repository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImp<T> extends Repository<T> {

    @Override
    public List<T> findAll() {
        return new ArrayList<>(repositorio);
    }

    @Override
    public T findById(Long id) {
        return repositorio.get(Math.toIntExact(id));
    }

    @Override
    public void save(T entity) {
        repositorio.add(entity);
    }

    @Override
    public void delete(Long id) {
        repositorio.remove(id);
    }
}
