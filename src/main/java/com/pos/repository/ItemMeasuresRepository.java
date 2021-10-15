package com.pos.repository;

import com.pos.model.ItemMeasures;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ItemMeasuresRepository extends CrudRepository<ItemMeasures,Integer> {
}
