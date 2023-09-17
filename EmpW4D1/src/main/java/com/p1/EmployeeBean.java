package com.p1;

public class EmployeeBean {
private NameBean name;
private CompanyBean company;

public EmployeeBean(NameBean name, CompanyBean company) {
	setName(name);
	setCompany(company);
}

public NameBean getName() {
	return name;
}

public void setName(NameBean name) {
	this.name = name;
}

public CompanyBean getCompany() {
	return company;
}

public void setCompany(CompanyBean company) {
	this.company = company;
}

}
