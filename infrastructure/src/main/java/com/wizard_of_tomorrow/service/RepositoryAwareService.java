package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import com.wizard_of_tomorrow.data.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface RepositoryAwareService<
        K extends Serializable,
        T extends BaseEntity<K>,
        R extends BaseRepository<K, T>> {

    Page<T> getPage(Pageable pageable);

    List<T> getAll();

    Optional<T> getById(K id);

    List<T> getByIds(List<K> ids);

    T createOrUpdate(T data);

    List<T> bulkCreateOrUpdate(List<T> data);

    void deleteById(K id);

    void bulkDeleteByIds(List<K> ids);

    R getRepository();

}
