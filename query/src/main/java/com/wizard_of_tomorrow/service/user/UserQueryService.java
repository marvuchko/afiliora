package com.wizard_of_tomorrow.service.user;

import com.wizard_of_tomorrow.entity.user.User;
import com.wizard_of_tomorrow.service.QueryService;

import java.util.UUID;

public interface UserQueryService extends QueryService<UUID, User> {
}
