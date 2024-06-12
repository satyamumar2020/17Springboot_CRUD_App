package com.satyam.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
//@Table(name="")
public class Student {
	@Id
	
	private Integer id;
	private String name;
	private String rollNo;
}
