package com.learn.oct2024.common.model.entity;

import com.learn.oct2024.common.model.enums.MatchResult;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@Data
@Builder
@Document(collection = "bet_detail")
public class BetDetail {

    @Id
    private String id;

    private String matchId;

    private List<Map<String, Object>> betInfo;

    private MatchResult result;

    private boolean isFinalized;
}
