package com.pos.repository;

import com.pos.model.Payment;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
