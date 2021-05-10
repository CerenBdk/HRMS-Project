package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employers")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{

//	@Id
//	@GeneratedValue
//	@Column(name= "user_id")
//	private int userId;
	
	@Column(name= "company_id")
	private int companyId;
	
	@Column(name= "website")
	private String website;
	
	@Column(name= "phone_number")
	private String phoneNumber;
	
	@Column(name = "is_verified")
	private boolean isVerified;
	
	public Employer() {
		
	}

	public Employer(int companyId, String website, String phoneNumber, boolean isVerified) {
		super();
		this.companyId = companyId;
		this.website = website;
		this.phoneNumber = phoneNumber;
		this.isVerified = isVerified;
	}
	
}
