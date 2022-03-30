package com.wizard_of_tomorrow.service.user.impl;

import com.wizard_of_tomorrow.entity.user.User;
import com.wizard_of_tomorrow.repository.user.UserRepository;
import com.wizard_of_tomorrow.service.AbstractQueryService;
import com.wizard_of_tomorrow.service.user.UserQueryService;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class UserQueryServiceImpl
    extends AbstractQueryService<UUID, User, UserRepository>
    implements UserQueryService {

  public UserQueryServiceImpl(UserRepository repository) {
    super(repository);
  }

}
