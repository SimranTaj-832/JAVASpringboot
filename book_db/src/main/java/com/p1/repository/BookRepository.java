package com.p1.repository;

import org.springframework.data.repository.CrudRepository;

import com.p1.model.Books;

public interface BookRepository extends CrudRepository<Books, Integer>{

}
