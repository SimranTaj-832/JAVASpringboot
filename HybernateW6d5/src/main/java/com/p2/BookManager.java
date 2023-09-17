package com.p2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
	protected SessionFactory sessionfactory;
	protected void setup() {
		final StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionfactory=new MetadataSources(registry).buildMetadata().buildSessionFactory();
			System.out.println(sessionfactory);
		}catch(Exception ex) {
	
			System.out.println("Session Factory not created!!");
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	protected void exit() {
		sessionfactory.close();
	}
	protected void create() {
		Book book=new Book();
		book.setId(7);
		book.setTitle("SISC");
		book.setAuthor("Ahan");
		book.setPrice(65.23f);
		
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}
	protected void read() {
		Session session=sessionfactory.openSession();
		long bookid=5;
		Book book=session.get(Book.class, bookid);
		
		System.out.println("Title: "+book.getAuthor());
		System.out.println("Author: "+book.getAuthor());
		System.out.println("Price: "+book.getPrice());
		session.close();			
	}
	
	protected void update() {
		
	}
	protected void delete() {
		
	}
	
	public static void main(String[]args) {
		BookManager manager=new BookManager();
		manager.setup();
		manager.create();
		manager.read();
		manager.exit();
	}
}
