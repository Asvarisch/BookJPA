package telran.ashkelon2020.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.ashkelon2020.book.model.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {
	

}
