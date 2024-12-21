package com.learn.oct2024.common.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "app_user")
public class AppUser {

    @Id
    private String id;

    private String username;

    private String password;

    private String passwordHint;

    private String role;

    private Integer balance;
}