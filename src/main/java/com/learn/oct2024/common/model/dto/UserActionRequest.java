package com.learn.oct2024.common.model.dto;

import com.learn.oct2024.common.model.enums.UserAction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserActionRequest {

    private String id;

    private UserAction action;

    private Integer amount;
}
