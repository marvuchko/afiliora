package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface QueryService<
        K extends Serializable,
        T extends BaseEntity<K>> {

    Page<T> getPage(Pageable pageable);

    List<T> getAll();

    Optional<T> getById(K id);

    List<T> getByIds(List<K> ids);

}
