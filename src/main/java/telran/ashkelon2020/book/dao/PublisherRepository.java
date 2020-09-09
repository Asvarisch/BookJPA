package telran.ashkelon2020.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.ashkelon2020.book.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {
	
	

}
