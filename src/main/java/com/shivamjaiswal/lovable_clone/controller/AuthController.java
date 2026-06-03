package com.shivamjaiswal.lovable_clone.controller;

import com.shivamjaiswal.lovable_clone.dto.auth.AuthResponse;
import com.shivamjaiswal.lovable_clone.dto.auth.LoginRequest;
import com.shivamjaiswal.lovable_clone.dto.auth.SignUpRequest;
import com.shivamjaiswal.lovable_clone.dto.auth.UserProfileResponse;
import com.shivamjaiswal.lovable_clone.service.AuthService;
import com.shivamjaiswal.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signUp(SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authService.signup(signUpRequest));
    }

    @PostMapping("/Login")
    public ResponseEntity<AuthResponse> login(LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.Login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse>  getProfile() {
        Long UserId = 1l;
        return ResponseEntity.ok(userService.getProfile(UserId));
    }
}
