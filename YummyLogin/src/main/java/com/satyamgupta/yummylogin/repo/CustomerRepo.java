package com.satyamgupta.yummylogin.repo;


import com.satyamgupta.yummylogin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
