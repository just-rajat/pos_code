package com.pos.repository;

import com.pos.model.CustomerAccount;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface CustomerAccountRepository extends CrudRepository<CustomerAccount,Integer> {
}
