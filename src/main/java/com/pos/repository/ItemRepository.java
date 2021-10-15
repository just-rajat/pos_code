package com.pos.repository;

import com.pos.model.Item;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ItemRepository extends CrudRepository<Item,Integer> {
}
