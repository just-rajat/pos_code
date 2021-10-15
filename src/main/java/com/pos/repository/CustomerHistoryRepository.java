package com.pos.repository;

import com.pos.model.CustomerHistory;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CustomerHistoryRepository extends CrudRepository<CustomerHistory,Integer> {
}
