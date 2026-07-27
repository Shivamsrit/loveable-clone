package com.shivamjaiswal.lovable_clone.entity;

import com.shivamjaiswal.lovable_clone.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {
    ProjectMemberId projectMemberId;

    Project project;

    User user;

    ProjectRole role;

    Instant invitedAt;

    Instant acceptedBy;


}
