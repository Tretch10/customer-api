package com.app.dog.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "customer_tbl")
public class Customer {
	private int Sno;
	private String username;
	private String password;
	private String email;
	private String name;
	private String gender;
	private String mobile;
	private Timestamp dob;
	private List<Dog> dogs;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	
	@OneToMany(mappedBy = "username", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
	public List<Dog> getDogs() {
		return dogs;
	}
	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}


	
    
	
	
	
	
	
	
	
	
	
	
	

}
