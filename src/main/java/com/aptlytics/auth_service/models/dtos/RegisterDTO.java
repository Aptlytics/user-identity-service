package com.aptlytics.auth_service.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterDTO {
    @NonNull
    private String fullName;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private LocalDate dateOfBirth;
}
