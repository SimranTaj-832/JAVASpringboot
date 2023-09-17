package com.p1;

import javax.persistence.*;
@Entity
@Table(name="emp")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="employee")

public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="name")
private String name;

public Employee() {}


public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}



}
