package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

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
	
	@Column(name= "created_at")
	private LocalDate createdDate;
	
	@Column(name= "is_active")
	private boolean isActive;
	
	@Column(name= "is_deleted")
	private boolean isDeleted;

	
	public Department(String departmentName, LocalDate createdDate, boolean isActive, boolean isDeleted) {
		super();
		this.departmentName = departmentName;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}
	
}
