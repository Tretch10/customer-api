package com.app.dog.controller;

import java.security.Timestamp;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dog.dao.CustomerRepository;
import com.app.dog.model.Customer;
import com.app.dog.model.Dog;
import com.app.dog.service.DogService;


@RestController

@RequestMapping("/")

public class DogController {
	
	@Autowired
    private DogService dogService;
    @GetMapping("/getdogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> dogs = dogService.getAllDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
    @PostMapping("/dog")
    public ResponseEntity<Dog> saveDog(@RequestBody Dog dog) {
        Dog dg = dogService.addDog(dog);
        return new ResponseEntity<>(dg, HttpStatus.OK);
    }
    @PutMapping("/dog")
    public ResponseEntity<Dog> updateDog(@RequestBody Dog dog) {
        Dog dg = dogService.editEmployees(dog);
        return new ResponseEntity<>(dg, HttpStatus.OK);
    }
    @DeleteMapping("/dog")
    public ResponseEntity<String> deleteDog(@RequestParam(name = "dogId") Integer dogId) {
        dogService.deleteDogs(dogId);
        return new ResponseEntity<>("Dog with ID :" + dogId + " deleted successfully", HttpStatus.OK);
    }
	  

}
