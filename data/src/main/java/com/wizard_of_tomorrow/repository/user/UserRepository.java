package com.wizard_of_tomorrow.repository.user;

import com.wizard_of_tomorrow.data.repository.BaseRepository;
import com.wizard_of_tomorrow.entity.user.User;
import java.util.UUID;

public interface UserRepository extends BaseRepository<UUID, User> {
}
