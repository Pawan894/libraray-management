package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
@Autowired
private BookService bookService;

@PostMapping("/borrow/{bookId}/{studentId}")
public ResponseEntity<Book>
borrowBook(@PathVariable Long bookId,@PathVariable Long studentId){
	return
			ResponseEntity.ok(bookService.borrowBook(bookId, studentId));
}
@PostMapping("/return/{bookId}")
public ResponseEntity<Book>
returnBook(@PathVariable Long bookId){
	return 
			ResponseEntity.ok(bookService.returnBook(bookId));
}
}
