package com.pos.repository;

import com.pos.model.CountryCurrency;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CountryCurrencyRepository extends CrudRepository<CountryCurrency,Integer> {
}
