package com.wizard_of_tomorrow.entity.user;

import com.wizard_of_tomorrow.converter.AdditionalDataConverter;
import com.wizard_of_tomorrow.data.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Map;
import java.util.UUID;

@Entity
@Setter
@Getter
@Table(name = "app_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity<UUID> {

    String firstName;

    String lastName;

    String username;

    String password;

    String email;

    String imageUrl;

    @Convert(converter = AdditionalDataConverter.class)
    Map<String, Object> additionalData;

    @ManyToOne
    @JoinColumn(name = "role_id")
    UserRole role;

}
