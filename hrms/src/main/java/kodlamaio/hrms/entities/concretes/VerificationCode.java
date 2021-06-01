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
@Table(name="verification_codes")
@Data
@NoArgsConstructor
public class VerificationCode {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name= "created_at", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name= "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name= "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	public VerificationCode(int id, int userId, String code, boolean isConfirmed) {
		super();
		this.id = id;
		this.userId = userId;
		this.code = code;
		this.isConfirmed = isConfirmed;
	}
	
}
