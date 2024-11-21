package com.satyamgupta.yummylogin.repo;


import com.satyamgupta.yummylogin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    

}
