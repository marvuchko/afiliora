package com.wizard_of_tomorrow.entity.user;

import com.wizard_of_tomorrow.converter.AdditionalDataConverter;
import com.wizard_of_tomorrow.data.entity.BaseEntity;
import java.util.Map;
import java.util.UUID;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Setter
@Getter
@Table(name = "app_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity<UUID> {

  String firstName;

  String lastName;

  String password;

  String email;

  String imageUrl;

  @Convert(converter = AdditionalDataConverter.class)
  Map<String, Object> additionalData;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "role_id")
  UserRole role;

}
