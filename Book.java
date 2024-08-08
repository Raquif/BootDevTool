package com.jpa.test;

public class Book {
	private int id;
	private String Title;
	private String Author;
	public Book(int id, String title, String author) {
	
		this.id = id;
		Title = title;
		Author = author;
	}
	public Book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", Title=" + Title + ", Author=" + Author + "]";
	}
	
	
	

}
