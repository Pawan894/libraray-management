package controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;

@OneToMany(mappedBy="borrower")
private List<Book> borrowedBooks;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public List<Book> getBorrowedBooks() {
	return borrowedBooks;
}

public void setBorrowedBooks(List<Book> borrowedBooks) {
	this.borrowedBooks = borrowedBooks;
}
}
