package com.pos.repository;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface TempSalesDetailsRepository extends CrudRepository<Id,Integer> {
}