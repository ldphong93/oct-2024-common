package com.learn.oct2024.common.model.dto;

import lombok.Data;

@Data
public class UserInfoRequest {

    private String username;

    private String password;

    private String role;

    private Integer balance;
}
