package com.satyamgupta.yummylogin.service;

import com.satyamgupta.yummylogin.dto.CustomerRequest;
import com.satyamgupta.yummylogin.dto.CustomerResponse;
import com.satyamgupta.yummylogin.entity.Customer;
import com.satyamgupta.yummylogin.mapper.CustomerMapper;
import com.satyamgupta.yummylogin.repo.CustomerRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
}