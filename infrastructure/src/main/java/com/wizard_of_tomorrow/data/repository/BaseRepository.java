package com.wizard_of_tomorrow.data.repository;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface BaseRepository<K extends Serializable, T extends BaseEntity<K>> extends JpaRepository<T, K> {
}
