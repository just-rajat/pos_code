package com.pos.repository;

import com.pos.model.Product;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
