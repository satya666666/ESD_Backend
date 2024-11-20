package com.satyamgupta.yummylogin.dto;
import jakarta.validation.constraints.*;

public record LoginRequest (
        @NotNull(message = "Email is required")
        @Email(message = "Email must be valid")
        String email,

        @NotNull(message = "Password is required")
        @NotEmpty(message = "Password cannot be empty")
        String password
){
}
