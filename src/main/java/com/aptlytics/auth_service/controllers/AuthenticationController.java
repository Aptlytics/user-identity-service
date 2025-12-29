package com.aptlytics.auth_service.controllers;

import com.aptlytics.auth_service.services.AuthenticationService;
import com.aptlytics.auth_service.utils.HttpUtil;
import com.aptlytics.response.ServiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.UUID;

import static com.aptlytics.response.ServiceResponse.getResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/authenticate")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    private final HttpUtil httpUtil;

    @PostMapping("/login")
    public ResponseEntity<ServiceResponse<UUID>> login() {

        // send login request

        // validate request

        // if valid, generate token

        var headers = new HttpHeaders();
        var cookie = httpUtil.generateTokenCookie("SAMPLE_TOKEN_VALUE");
        headers.add(HttpHeaders.SET_COOKIE, cookie.toString());
        headers.add(HttpHeaders.AUTHORIZATION, "SAMPLE_TOKEN_VALUE");
        return getResponse(true, UUID.randomUUID(), Collections.emptyList(), headers);
    }

    @PostMapping("/register")
    public ResponseEntity<ServiceResponse<UUID>> register() {
        return null;
    }
}
