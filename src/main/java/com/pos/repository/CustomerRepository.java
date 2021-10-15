package com.pos.repository;

import com.pos.model.Customer;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
