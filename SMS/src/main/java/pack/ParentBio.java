package pack;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="parent")
public class ParentBio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	@Column(name="firstName")
	public String firstName;
	@Column(name="date of birth")
	public String dateOfBirth;
	@Column(name="gender")
	public boolean gender;
	@Column(name="bloodGroup")
	public String bloodGroup;
	@Column(name="nationality")
	public String nationality;
	@Column(name="category")
	public String category;
	@Column(name="religion")
	public String Religion;
	
	public ParentBio() {}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getReligion() {
		return Religion;
	}
	public void setReligion(String religion) {
		Religion = religion;
	}
	
	
	
}
