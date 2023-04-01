package com.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.os.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	
}
