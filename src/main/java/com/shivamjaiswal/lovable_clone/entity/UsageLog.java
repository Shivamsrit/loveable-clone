package com.shivamjaiswal.lovable_clone.entity;

import java.time.Instant;

public class UsageLog {
    Long id;
    User user;
    Project project;

    String Action;

    Integer tokensUsed;
    Integer durationMs;

    Instant createdAt;

    String metaData; // JSON OF { MODEL_USED , PROMPT_USED}

}
