package com.satyamgupta.esd_assignment.controller;

import com.satyamgupta.esd_assignment.dto.LoginRequest;
import com.satyamgupta.esd_assignment.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/api/v1/auth")
    public class AuthenticationController {
        private final CustomerService customerService;

        @PostMapping("/login")
        public ResponseEntity<String> login(@RequestBody @Valid LoginRequest request) {
            return ResponseEntity.ok(customerService.login(request));
        }
    }

