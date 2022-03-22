package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.repository.BaseRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class RepositoryAwareService<R extends BaseRepository<?, ?>> {

    final R repository;

}
