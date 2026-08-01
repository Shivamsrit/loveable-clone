package com.shivamjaiswal.lovable_clone.service;

import com.shivamjaiswal.lovable_clone.dto.auth.AuthResponse;
import com.shivamjaiswal.lovable_clone.dto.auth.LoginRequest;
import com.shivamjaiswal.lovable_clone.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignUpRequest signUpRequest);

    AuthResponse Login(LoginRequest loginRequest);
}
