package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employees")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{

//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "department_id")
	private int departmentId;

	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int departmentId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmentId = departmentId;
	}
}
