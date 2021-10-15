package com.pos.repository;

import com.pos.model.PurchaseDetails;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface PurchaseDetailsRepository extends CrudRepository<PurchaseDetails,Integer> {
}
