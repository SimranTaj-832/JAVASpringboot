package com.p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao{
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public int save(Emp p) {
	String sql="insert into empl values("+p.getId()+","+"'"+p.getName()+"'"+","+p.getSalary()+")";
	return ((JdbcOperations) template).update(sql);
	}
	public int update(Emp p) {
		String sql="update empl set name="+"'"+p.getName()+"',salary="+p.getSalary()+"where id="+p.getId();
		return ((JdbcOperations) template).update(sql);
	}
	
	public int delete(int id) {
		String sql="delete from empl where id="+id+"";
		return ((JdbcOperations) template).update(sql);
	}
	
	public Emp getEmpById(int id) {
		String sql="select *from empl where id=?";
		return ((JdbcOperations) template).queryForObject(sql,new Object[] {id}, new BeanPropertyRowMapper<Emp>(Emp.class));
	}
	
	public List<Emp>getEmployee(){
		return ((JdbcOperations) template).query("select* from empl",new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs,int row)throws SQLException{
				Emp e=new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				return e;
			}
		});
	}
}
