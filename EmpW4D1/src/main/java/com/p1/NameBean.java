package com.p1;

public class NameBean {
private String firstName;
private String lastName;
public NameBean() {}
public NameBean(String firstName,String lastName) {
	setFirstName(firstName);
	setLastName(lastName);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
