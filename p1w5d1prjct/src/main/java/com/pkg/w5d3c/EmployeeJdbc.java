package com.pkg.w5d3c;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJdbc {
	private JdbcTemplate jt;
	private DataSource dsr;
	
	public void setDsr(DataSource dataSource) {
		this.dsr=dataSource;
		this.jt=new JdbcTemplate(dsr);
	}
	
	public Employee getEmployeeById(int id) {
		String sql="select* from employee where id=?";
		Employee employee=jt.queryForObject(sql, new EmployeeRowMapper(),new Object[]{id});
		return employee;
	}
	
	public List<Employee>getAllEmployees(){
		String sql="select * from employee";
		List<Employee> employee=jt.query(sql, new EmployeeRowMapper());
		return employee;
	}
	
	public Employee updateEmployee(String name, int id) {
		String sql="update employee set name=? where id=?";
		jt.update(sql,new Object[]{name,id});
		Employee emp= getEmployeeById(id);
		return emp;
	}
	public void insertEmployee(int id,String name, int age, int salary) {
		String sql="insert into employee values(?,?,?,?)";
		jt.update(sql,new Object[]{id,name,age,salary});
	}
	public void deleteEmployee(int id) {
		String sql="delete from employee where id=?";
		jt.update(sql,new Object[] {id});
	}
	
}
