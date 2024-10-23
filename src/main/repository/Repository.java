package main.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T> {
    protected List<T> repositorio = new ArrayList<>();

    public abstract List<T> findAll();
    public abstract T findById(Long id);
    public abstract void save(T entity);
    public abstract void delete(Long id);
}
