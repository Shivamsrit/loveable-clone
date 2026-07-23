package com.shivamjaiswal.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;

    ChatSession chatSession;

    String content;
    String toolCalls;  // json array of tools called

    Integer tokensUsed;



}
