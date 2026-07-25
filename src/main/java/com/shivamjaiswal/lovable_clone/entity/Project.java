package com.shivamjaiswal.lovable_clone.entity;

import java.time.Instant;

public class Project {
    Long id;
    String name;
    User Owner;

    Boolean ispublic = false;

    Instant createdAt;
    Instant updatedAt;

    Instant deletedAt;

}
