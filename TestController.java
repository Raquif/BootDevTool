package com.jpa.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;




@RestController
public class TestController {
	@Autowired
	private BookService bookService;
	//@RequestMapping("/test")
	//@ResponseBody
	/*public String test() {
		int a=220;
		int b=459;
		int c= a+b;
		return "This is just Testing sum of a and b is "+(c);
		
	}
*/
	
	//@RequestMapping(value="/books",method=RequestMethod.GET)
	/*
	 * @GetMapping("/books") public Book getBooks() { Book book= new Book();
	 * book.setId(676); book.setTitle("Java Complete Refrence");
	 * book.setAuthor("Balagurswamy");
	 * 
	 * return book;
	 * 
	 * }
	 */
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookService.getAllBooks();
		
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return  bookService.getBookById(id);
		
	}
}
