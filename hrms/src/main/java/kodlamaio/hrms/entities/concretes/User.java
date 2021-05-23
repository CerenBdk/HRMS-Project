package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
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
	
	@Column(name= "created_at")
	private LocalDate createdAt;
	
	@Column(name= "is_active")
	private boolean isActive;
	
	@Column(name= "is_deleted")
	private boolean isDeleted;
	
}
