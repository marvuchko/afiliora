package com.wizard_of_tomorrow.service;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import com.wizard_of_tomorrow.data.repository.BaseRepository;
import java.io.Serializable;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractCommandService<
    K extends Serializable,
    T extends BaseEntity<K>,
    R extends BaseRepository<K, T>> extends RepositoryAwareService<R>
    implements CommandService<K, T> {

  protected AbstractCommandService(R repository) {
    super(repository);
  }

  @Override
  public T createOrUpdate(T data) {
    return getRepository().save(data);
  }

  @Override
  public List<T> bulkCreateOrUpdate(List<T> data) {
    return getRepository().saveAll(data);
  }

  @Override
  public void deleteById(K id) {
    getRepository().deleteById(id);
  }

  @Override
  public void bulkDeleteByIds(List<K> ids) {
    getRepository().deleteAllById(ids);
  }

}
