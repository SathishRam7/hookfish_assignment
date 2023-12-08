package org.ram.repo;

import org.ram.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositary extends JpaRepository<Customer, Integer> {

}
