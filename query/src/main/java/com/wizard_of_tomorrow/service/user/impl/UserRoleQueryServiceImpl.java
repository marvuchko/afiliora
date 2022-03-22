package com.wizard_of_tomorrow.service.user.impl;

import com.wizard_of_tomorrow.entity.user.UserRole;
import com.wizard_of_tomorrow.repository.user.UserRoleRepository;
import com.wizard_of_tomorrow.service.AbstractQueryService;
import com.wizard_of_tomorrow.service.user.UserRoleQueryService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserRoleQueryServiceImpl
        extends AbstractQueryService<UUID, UserRole, UserRoleRepository>
        implements UserRoleQueryService {

    public UserRoleQueryServiceImpl(UserRoleRepository repository) {
        super(repository);
    }

}
