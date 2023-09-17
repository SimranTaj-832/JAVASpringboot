package com.p1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.model.Books;
import com.p1.repository.BookRepository;

//defining the business logic
@Service
public class BooksService {
	@Autowired
	BookRepository booksRepository;
	
	//get all books
	public List<Books>getAllBooks(){
		List<Books>books=new ArrayList<Books>();
		booksRepository.findAll().forEach(books1->books.add(books1));
		return books;
	}
	
	//getting specific record
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}
	//save r update
	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}
	//delete
	public void delete(int id) {
		booksRepository.deleteById(id);
	}

}
