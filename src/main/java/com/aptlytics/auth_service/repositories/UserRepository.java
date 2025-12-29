package com.aptlytics.auth_service.repositories;


import com.aptlytics.auth_service.models.AppUser;
import com.aptlytics.auth_service.models.dtos.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<AppUser, UUID> {

    @Query(value = """
            select U.full_name, U.email, U.date_of_birth, U.is_verified, U.last_signed_in_as
            from AppUser U
            where U.email = :email
            """, nativeQuery = true)
    Optional<UserDTO> findUserByEmail(@Param("email") String email);
}
