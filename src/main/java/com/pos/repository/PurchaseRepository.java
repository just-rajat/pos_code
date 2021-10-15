package com.pos.repository;

import com.pos.model.Purchase;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface PurchaseRepository extends CrudRepository<Purchase,Integer> {
}
