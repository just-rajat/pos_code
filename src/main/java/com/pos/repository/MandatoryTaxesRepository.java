package com.pos.repository;

import com.pos.model.MandatoryTaxes;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface MandatoryTaxesRepository extends CrudRepository<MandatoryTaxes,Integer> {
}
