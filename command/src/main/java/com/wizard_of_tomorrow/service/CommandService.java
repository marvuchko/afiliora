package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface CommandService<
        K extends Serializable,
        T extends BaseEntity<K>> {

    T createOrUpdate(T data);

    List<T> bulkCreateOrUpdate(List<T> data);

    void deleteById(K id);

    void bulkDeleteByIds(List<K> ids);

}
