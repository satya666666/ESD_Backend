package com.satyamgupta.yummyrest.mapper;

import com.satyamgupta.yummyrest.dto.CustomerRequest;
import com.satyamgupta.yummyrest.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .password(request.password())
                .build();
    }
}
