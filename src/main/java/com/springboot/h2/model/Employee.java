package com.springboot.h2.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity annotation specifies that the class is mapped to a database table.
@Entity
@Table(name="employee")
public class Employee {

	// @Id annotation specifies the primary key of an entity.
	// @GeneratedValue provides the generation strategy specification for the primary key values.
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	//@Column(name="name")
	private String name;
	//@Column(name="salary")
	private double salary;
	//@Column(name="email_id")
	private String emailid;

	// Default constructor.
	public Employee() {	}

	// Parameterized constructor.
	public Employee(int id, String name, Double salary, String emailid) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailid = emailid;
	}

	// Getters.
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getEmailid() {
		return emailid;
	}
}
