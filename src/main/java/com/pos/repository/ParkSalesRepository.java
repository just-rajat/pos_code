package com.pos.repository;

import com.pos.model.ParkSales;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ParkSalesRepository extends CrudRepository<ParkSales,Integer> {
}
