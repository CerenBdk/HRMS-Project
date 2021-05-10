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
@Table(name = "employers_verification_employees")
@Data
@NoArgsConstructor
public class EmployerVerificationEmployee {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name= "employer_id")
	private int employerId;
	
	@Column(name= "employee_id")
	private int employeeId;
	
	@Column(name= "created_at")
	private LocalDate createdAt;

	public EmployerVerificationEmployee(int employerId, int employeeId, LocalDate createdAt) {
		super();
		this.employerId = employerId;
		this.employeeId = employeeId;
		this.createdAt = createdAt;
	}
}
