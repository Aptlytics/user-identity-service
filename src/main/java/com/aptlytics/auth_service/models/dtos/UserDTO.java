package com.aptlytics.auth_service.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private boolean isVerified;
    private UUID lastSignedInAs;
}
