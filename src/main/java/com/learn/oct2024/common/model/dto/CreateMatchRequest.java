package com.learn.oct2024.common.model.dto;

import lombok.Data;

@Data
public class CreateMatchRequest {

    private String title;

    private String description;

    private String matchDate;

    private String createdBy;
}
