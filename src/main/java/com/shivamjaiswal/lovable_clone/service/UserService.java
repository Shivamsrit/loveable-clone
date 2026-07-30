package com.shivamjaiswal.lovable_clone.service;

import com.shivamjaiswal.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
     UserProfileResponse getProfile(Long userId);
}
