package com.pos.repository;

import com.pos.model.ParkPurchase;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ParkPurchaseDetailsRepository extends CrudRepository<ParkPurchase,Integer> {
}
