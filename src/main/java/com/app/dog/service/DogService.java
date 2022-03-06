package com.app.dog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dog.dao.CustomerRepository;
import com.app.dog.dao.DogRepository;
import com.app.dog.model.Customer;
import com.app.dog.model.Dog;

@Service
public class DogService {
	@Autowired
    private DogRepository dogRepository;
    @Autowired
    private CustomerRepository customerRepository;
    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }
    
    public Dog addDog(Dog dog) {
    	
       /* Customer cust = customerRepository.findById(dog.getCustomer().getId()).orElse(null);
        if (null == cust) {
            cust = new Customer();
        }
        cust.setDeptName(dog.getCustomer().getCustName());
        dog.setCustomer(cust);*/
        return dogRepository.save(dog);
    	
    }
    public Dog editEmployees(Dog entity) {
        return dogRepository.save(entity);
    }
    public void deleteDogs(Integer id) {
        dogRepository.deleteById(id);
    }

}
