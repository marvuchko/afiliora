package com.wizard_of_tomorrow.entity.user;

import com.wizard_of_tomorrow.data.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "app_user_role")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRole extends BaseEntity<UUID> {

    String name;

    @OneToMany(mappedBy = "role")
    List<User> users;

}
