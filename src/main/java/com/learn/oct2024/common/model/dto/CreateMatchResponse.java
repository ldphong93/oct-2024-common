package com.learn.oct2024.common.model.dto;

import com.learn.oct2024.common.model.entity.Match;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateMatchResponse {

    private boolean successful;

    private String message;

    private Match match;
}
