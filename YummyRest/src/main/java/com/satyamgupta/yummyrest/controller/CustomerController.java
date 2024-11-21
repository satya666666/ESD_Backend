package com.satyamgupta.yummyrest.controller;

import com.satyamgupta.yummyrest.dto.CustomerRequest;
import com.satyamgupta.yummyrest.dto.LoginRequest;
import com.satyamgupta.yummyrest.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody @Valid CustomerRequest request) {
        return ResponseEntity.ok(customerService.createCustomer(request));
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginCustomer(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(customerService.loginCustomer(request));
    }

}
