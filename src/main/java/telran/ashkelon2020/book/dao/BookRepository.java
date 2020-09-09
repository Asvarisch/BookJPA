package telran.ashkelon2020.book.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import telran.ashkelon2020.book.model.Author;
import telran.ashkelon2020.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	
	@Query("select b from Book b JOIN b.publisher p where p.publisherName = :publisherName")
	Stream<Book> findBooksByPublisherName(@Param("publisherName") String publisherName);
	
	@Query("select b.authors from Book b where b.isbn = :isbn")
	Stream<Author> findBookAuthors(@Param("isbn") String isbn);
	
	@Query("select b from Book b JOIN b.authors a where a.name = :authorName ")
	Stream<Book> findBooksByAuthor(@Param("authorName")String authorName);
	

}
