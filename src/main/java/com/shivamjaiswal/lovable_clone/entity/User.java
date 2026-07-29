package com.shivamjaiswal.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.Instant;

@Builder
@Entity
@Table(name = "User")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String Email;
    String PasswordHash;
    String Name;
    String AvatarUrl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;





}
