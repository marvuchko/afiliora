package com.wizard_of_tomorrow.data.repository;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<K extends Serializable, T extends BaseEntity<K>>
    extends JpaRepository<T, K> {
}
