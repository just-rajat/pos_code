package com.pos.repository;

import com.pos.model.SalesDetails;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface SalesDetailsRepository extends CrudRepository<SalesDetails,Integer> {
}
