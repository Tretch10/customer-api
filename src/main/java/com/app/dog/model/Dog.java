package com.app.dog.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dogs_tbl")
public class Dog {
	private int Sno;
	private String name;
	private String color;
	private String breed;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "username"), name = "username")
	private String username;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
