package com.pos.repository;

import com.pos.model.Discount;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface DiscountRepository extends CrudRepository<Discount,Integer> {
}
