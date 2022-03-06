package com.app.dog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.dog.model.Dog;

public interface DogRepository extends JpaRepository<Dog, Integer> {
	

}
