package com.pos.repository;

import com.pos.model.CustomerPaymentHistory;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CustomerPaymentHistoryRepository extends CrudRepository<CustomerPaymentHistory,Integer> {
}
