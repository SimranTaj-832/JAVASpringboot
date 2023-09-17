package com.pkg.d2;

public class Employee {
	int Id;
	String name;
	
	Employee(int id, String name){
		this.Id=id;
		this.name=name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + "]";
	}
	
}
