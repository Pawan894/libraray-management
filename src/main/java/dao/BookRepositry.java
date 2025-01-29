package dao;

public interface BookRepositry extends JpaRepositry<Book,Long> {}

	public interface AuthorRepositry extends JpaRepositry<Author,Long>{}
	
	public interface StudentRepositry extends JpaRepositry<Student,Long>{
		
}
