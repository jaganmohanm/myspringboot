package com.techprimers.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeDb {
@Id
@GeneratedValue
@Column(name= "Id")
	private Integer id;
@Column(name="Name")
	private String name;
	@Override
public String toString() {
	return "EmployeeDb [id=" + id + ", name=" + name + "]";
}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
