package pack.Studentmodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentbio")
public class StudentBio {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected int id;
	@Column(name = "surname")
	protected String surname;
	@Column(name = "firstName")
	protected String firstName;
	@Column(name = "gender")
	protected boolean gender;
	@Column(name = "bloodGroup")
	protected String bloodGroup;
	@Column(name = "nationality")
	protected String nationality;
	@Column(name = "religion")
	protected String religion;
	
	// Student Bio class without arguments
}
