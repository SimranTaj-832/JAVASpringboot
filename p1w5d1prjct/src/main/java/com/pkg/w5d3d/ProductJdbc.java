package com.pkg.w5d3d;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public class ProductJdbc {
	private JdbcTemplate jt;
	private DataSource dsr;
	
	public void setDsr(DataSource dataSource) {
		this.dsr=dataSource;
		this.jt=new JdbcTemplate(dsr);
	}
	
	public Product getProductById(int id) {
		String sql="select* from product where id=?";
		Product prd=jt.queryForObject(sql, new ProductRowMapper(),new Object[]{id});
		return prd;
	}
	
	public List<Product>getAllProducts(){
		String sql="select * from product";
		List<Product> prd=jt.query(sql, new ProductRowMapper());
		return prd;
	}
	
	public Product updateProduct(String name, int id) {
		String sql="update product set name=? where id=?";
		jt.update(sql,new Object[]{name,id});
		Product prd= getProductById(id);
		return prd;
	}
	public void insertProduct(int id,String name, String color, double rating) {
		String sql="insert into product values(?,?,?,?)";
		jt.update(sql,new Object[]{id,name,color,rating});
	}
	public void deleteProduct(int id) {
		String sql="delete from product where id=?";
		jt.update(sql,new Object[] {id});
	}
}
