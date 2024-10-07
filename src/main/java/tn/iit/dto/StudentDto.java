package tn.iit.dto;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (onlyExplicitlyIncluded = true) 
@ToString
public class StudentDto {
	@Include
	private int id ;
	private String firstName ;
	private String LastName ;

	

	

}
