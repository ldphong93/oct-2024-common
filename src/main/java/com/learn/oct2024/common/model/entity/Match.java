package com.learn.oct2024.common.model.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document("match")
public class Match {

    @Id
    private String id;

    private String title;

    private Date creationDate;

    private String createdBy;

    private Date matchDate;

    private String description;

    private String betRatio;
}