package com.pos.repository;

import com.pos.model.ParkSalesDetails;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ParkSalesDetailsRepository extends CrudRepository<ParkSalesDetails,Integer> {
}
