package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "jobseekers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Jobseeker extends User{

//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "national_id")
	private String nationalId;
	
	@Column(name= "year_of_birth")
	private int yearOfBirth;

	public Jobseeker() {
		
	}
	
	public Jobseeker(String firstName, String lastName, String nationalId, int yearOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.yearOfBirth = yearOfBirth;
	}
	
}
