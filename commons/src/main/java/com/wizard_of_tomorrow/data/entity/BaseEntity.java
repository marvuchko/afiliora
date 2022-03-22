package com.wizard_of_tomorrow.data.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseEntity<K extends Serializable> {

    @Id
    @GeneratedValue
    K id;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedBy
    LocalDateTime updatedAt;

    @CreatedBy
    K createdBy;

    @LastModifiedBy
    K updatedBy;

}
