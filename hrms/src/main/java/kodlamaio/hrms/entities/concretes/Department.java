package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name = "department_name")
	private String departmentName;

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
}
