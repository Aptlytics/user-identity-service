package com.aptlytics.auth_service.services;

import com.aptlytics.auth_service.models.dtos.RegisterDTO;
import com.aptlytics.auth_service.repositories.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    public UUID login() {
        return null;
    }

    public UUID register(@NonNull @Validated RegisterDTO registrationInput) {
        var user = userRepository.findUserByEmail(registrationInput.getEmail());
        return null;
    }
}
