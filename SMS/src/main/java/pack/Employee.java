package pack;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	protected int id;
	@Column(name = "first name")
	protected String fistName;
	@Column(name = "last name")
	protected String lastName;
	@Column(name = "department")
	protected String department;
	@Column(name = "qualification")
	protected String qualification;
	@Column(name = "type")
	protected boolean type;
	@Column(name = "joining date")
	protected String joiningDate;
	
	
	// Employee Class constructor with all properties except ID 
	public Employee(String firstName, String lastName, String department, String qualification, boolean type, String joiningDate) {
		super();
		this.fistName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.qualification = qualification;
		this.type = type;
		this.joiningDate = joiningDate;
	}
	
	// Employee Class constructor with all properties including ID
	public Employee(int id, String firstName, String lastName, String department, String qualification, boolean type, String joiningDate) {
		super();
		this.fistName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.qualification = qualification;
		this.type = type;
		this.joiningDate = joiningDate;
	}

	// SETTER and GETTER methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}
	
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	
	
}
