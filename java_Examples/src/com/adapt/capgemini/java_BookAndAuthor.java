package com.adapt.capgemini;
import java.util.Scanner;
class Author{
	String name;
	String email;
	char gender;
	public Author(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + "]";
	}
}
class Book{
	String isbn;
	String name;
	double price;
	int qty=0;
	Author[] author;
	public Book(String isbn, String name, double price, int qty, Author[] author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Author[] getAuthor() {
		return author;
	}
	public void setAuthor(Author[] author) {
		this.author = author;
	}
	public void printData() {
		System.out.println(this.isbn);
		System.out.println(this.name);
		for(int i=0;i<author.length;i++) {
			System.out.println(author[i].name);
			System.out.println(author[i].email);
		}
		System.out.println(this.price);
		System.out.println(this.qty);
	}
}
public class java_BookAndAuthor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Author1");
		Author a1=new Author(sc.nextLine(),sc.nextLine());
		System.out.println("Author2");
		Author a2=new Author(sc.nextLine(),sc.nextLine());
		Author[] authors=new Author[2];
		authors[0]=a1;
		authors[1]=a2;
		Book b=new Book("B001","JAVA", 1340.90, 5, authors);
		b.printData();
		
		
	}

}
