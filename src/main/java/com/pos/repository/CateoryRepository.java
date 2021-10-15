package com.pos.repository;

import com.pos.model.Category;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CateoryRepository extends CrudRepository<Category,Integer> {
}
