package com.pos.repository;

import com.pos.model.DefaultPrinter;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface DefaultPrinterRepository extends CrudRepository<DefaultPrinter,Integer> {
}
