package com.satyamgupta.yummyrest.repo;

import com.satyamgupta.yummyrest.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
