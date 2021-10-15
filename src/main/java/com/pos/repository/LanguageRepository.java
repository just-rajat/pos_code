package com.pos.repository;

import com.pos.model.Language;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface LanguageRepository extends CrudRepository<Language,Integer> {
}
