package com.app.dog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dog.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
