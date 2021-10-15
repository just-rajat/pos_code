package com.pos.repository;

import com.pos.model.CustomerDetails;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CustomerDetailsRepository extends CrudRepository<CustomerDetails,Integer> {
}
