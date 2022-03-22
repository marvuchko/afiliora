package com.wizard_of_tomorrow.service.user.impl;

import com.wizard_of_tomorrow.entity.user.User;
import com.wizard_of_tomorrow.repository.user.UserRepository;
import com.wizard_of_tomorrow.service.AbstractCommandService;
import com.wizard_of_tomorrow.service.user.UserCommandService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCommandServiceImpl
        extends AbstractCommandService<UUID, User, UserRepository>
        implements UserCommandService {

    public UserCommandServiceImpl(UserRepository repository) {
        super(repository);
    }

}
