package com.wizard_of_tomorrow.service.user;

import com.wizard_of_tomorrow.entity.user.User;
import com.wizard_of_tomorrow.service.CommandService;

import java.util.UUID;

public interface UserCommandService extends CommandService<UUID, User> {
}
