package telran.ashkelon2020.book.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"name"})
@Entity
public class Author implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8978862988150546470L;
	@Id
	String name;
	LocalDate birthDate;

}
