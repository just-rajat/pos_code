package com.pos.repository;

import com.pos.model.Sales;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface SalesRepository extends CrudRepository<Sales,Integer> {
}
