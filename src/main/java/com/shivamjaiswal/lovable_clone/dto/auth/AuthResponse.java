package com.shivamjaiswal.lovable_clone.dto.auth;

public record AuthResponse(
        String tokens,
        UserProfileResponse userProfileResponse
) {
}
