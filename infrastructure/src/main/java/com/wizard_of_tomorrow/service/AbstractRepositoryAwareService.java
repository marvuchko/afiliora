package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import com.wizard_of_tomorrow.data.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbstractRepositoryAwareService<
        K extends Serializable,
        T extends BaseEntity<K>,
        R extends BaseRepository<K, T>>  implements RepositoryAwareService<K, T, R> {

    private final R repository;

    @Override
    public Page<T> getPage(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> getById(K id) {
        return repository.findById(id);
    }

    @Override
    public List<T> getByIds(List<K> ids) {
        return repository.findAllById(ids);
    }

    @Override
    public T createOrUpdate(T data) {
        return repository.save(data);
    }

    @Override
    public List<T> bulkCreateOrUpdate(List<T> data) {
        return repository.saveAll(data);
    }

    @Override
    public void deleteById(K id) {
        repository.deleteById(id);
    }

    @Override
    public void bulkDeleteByIds(List<K> ids) {
        repository.deleteAllById(ids);
    }

    @Override
    public R getRepository() {
        return repository;
    }

}
