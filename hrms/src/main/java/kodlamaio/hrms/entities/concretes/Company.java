package kodlamaio.hrms.entities.concretes;

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

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
	
}
