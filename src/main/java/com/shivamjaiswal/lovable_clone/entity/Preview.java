package com.shivamjaiswal.lovable_clone.entity;

import com.shivamjaiswal.lovable_clone.enums.PreviewStatus;

import java.time.Instant;

public class Preview {
    Long id;

    Project project;

    String nameSpace;

    String podName;

    String previewUrl;

    PreviewStatus status;

    Instant startedAt;
    Instant terminatedAt;

    Instant createdAt;

}
