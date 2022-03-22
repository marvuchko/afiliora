package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import com.wizard_of_tomorrow.data.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public abstract class AbstractQueryService<
        K extends Serializable,
        T extends BaseEntity<K>,
        R extends BaseRepository<K, T>> extends RepositoryAwareService<R> implements QueryService<K, T> {

    protected AbstractQueryService(R repository) {
        super(repository);
    }

    @Override
    public Page<T> getPage(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    @Override
    public List<T> getAll() {
        return getRepository().findAll();
    }

    @Override
    public Optional<T> getById(K id) {
        return getRepository().findById(id);
    }

    @Override
    public List<T> getByIds(List<K> ids) {
        return getRepository().findAllById(ids);
    }

}
