package com.pos.repository;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface TempSalesRepository extends CrudRepository<Id,Integer> {
}
