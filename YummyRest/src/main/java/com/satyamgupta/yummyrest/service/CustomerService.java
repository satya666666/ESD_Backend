package com.satyamgupta.yummyrest.service;

import com.satyamgupta.yummyrest.dto.CustomerRequest;
import com.satyamgupta.yummyrest.dto.LoginRequest;
import com.satyamgupta.yummyrest.entity.Customer;
import com.satyamgupta.yummyrest.mapper.CustomerMapper;
import com.satyamgupta.yummyrest.repo.CustomerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo repo;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        Customer customer = mapper.toEntity(request);
        repo.save(customer);
        return "Created";
    }

    public String loginCustomer(LoginRequest request) {
        Customer customer = repo.findByEmail(request.email());

        if (customer == null) {
            return "User not found";
        }

        // Check if the password matches
        if (request.password().equals(customer.getPassword())) {
            return "Logged in successfully";
        } else {
            return "Wrong password";
        }
    }

}
