package com.example;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManyToManyApplicationTests {

	@Autowired
	private BookRepository bookRepository;
	 
	@Test
	void contextLoads() {
	}

	@Test
	void findByTitle() {
	    // Test a custom query method to find books by title
	    List<Book> books = bookRepository.findByTitle("Sample Book");

	    // Assertions
	    assertNotNull(books);
	    assertEquals(1, books.size());
	    assertEquals("Knowledge Quest", books.get(0).getTitle());
	}

}
