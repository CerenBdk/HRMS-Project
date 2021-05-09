package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue
	@Column(name= "id")
	private int id;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "password")
	private String password;
	
	@Column(name= "confirm_password")
	private String confirmPassword;
	
	@Column(name= "isActive")
	private boolean isActive;
	
	@Column(name= "isDeleted")
	private boolean isDeleted;
	
	@Column(name= "createdAt")
	private LocalDate createdDate;
	
	public User() {
		
	}
	
	public User(String email, String password, String confirmPassword, boolean isActive, boolean isDeleted,
			LocalDate createdDate) {
		super();
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdDate = createdDate;
	}
	
}
