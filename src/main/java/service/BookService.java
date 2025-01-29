package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookRepositry;

import controller.Book;
import controller.Student;

@Service
public class BookService {
@Autowired
private BookRepositry bookRepositry;
public Book borrowBook(Long bookId,Long studentId) {
	Book book=
			bookRepositry.findById(bookId).orElseThrow()-> new RuntimeException("Book not found"));
			Student student=
					studentRepositry.findById(studentId).orElseThrow(()->new
							RuntimeException("Student not found"));
			if (book.isAvailable()) {
				book.setAvailable(false);
				book.setBorrower(student);
				return
						bookRepositry.save(book);
			}
			throw new RuntimeException("Book is not available");
}
public Book returnBook(Long bookId) {
	Book book=
			bookRepositry.findById(bookId).orElseThrow(()->new RuntimeException("Book not found"));
	book.setAvailable(true);
	book.setBorrower(null);
	return
			bookRepositry.save(book);
}
}
