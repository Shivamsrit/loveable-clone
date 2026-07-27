package com.shivamjaiswal.lovable_clone.entity;

import com.shivamjaiswal.lovable_clone.enums.SubscriptionStatus;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;

    @ManyToOne
    User user;

    Plan plan;
    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd;
    Instant currentAt;
    Instant UpdatedAt;
}
