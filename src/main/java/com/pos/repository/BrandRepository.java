package com.pos.repository;

import com.pos.model.Brand;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface BrandRepository extends CrudRepository<Brand,Integer> {
}
