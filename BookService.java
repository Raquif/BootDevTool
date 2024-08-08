package com.jpa.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;




@Component
public class BookService {
	private static List<Book> list= new ArrayList<>();
	static {
		// fake service
		list.add(new Book(86, "Advanced Java Books", "XYZ"));
		list.add(new Book(46, "Complete Refrence ", "ABC"));
		list.add(new Book(186, "Head First:", "L123"));
		list.add(new Book(486, "Thing on Java", "Y786"));
	}
		// get all books
		
		public List<Book>getAllBooks()
		{
			return list;
			
		}
		public Book getBookById(int id) {
			Book book = null;
			list.stream().filter(e->e.getId()==id).findFirst().get();
			return book;
			
		}
	

}
