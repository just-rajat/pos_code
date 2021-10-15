package com.pos.repository;

import com.pos.model.ItemSuspend;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface ItemSuspendRepository extends CrudRepository<ItemSuspend,Integer> {
}
