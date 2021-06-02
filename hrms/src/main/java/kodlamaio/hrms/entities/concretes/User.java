package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
public class User extends Base{

	
	@Column(name= "email")
	private String email;
	
	@Column(name= "password")
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	
}
