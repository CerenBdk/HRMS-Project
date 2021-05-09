package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "companies")
@Data
public class Company {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name= "created_at")
	private LocalDate createdDate;
	
	@Column(name= "is_active")
	private boolean isActive;
	
	@Column(name= "is_deleted")
	private boolean isDeleted;

	public Company() {
		
	}
	
	public Company(String companyName, LocalDate createdDate, boolean isActive, boolean isDeleted) {
		super();
		this.companyName = companyName;
		this.createdDate = createdDate;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

}
