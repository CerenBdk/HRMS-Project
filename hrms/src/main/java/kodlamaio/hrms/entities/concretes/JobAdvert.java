package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
//	@Column(name = "job_position_id")
//	private int jobPositionId;
	
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "city_id")
	private int cityId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary_min")
	private double salaryMin;
	
	@Column(name = "salary_max")
	private double salaryMax;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "published_at")
	private LocalDate publishedAt;
	
	@Column(name = "created_at")
	private LocalDate createdAt;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "is_deleted")
	private boolean isDeleted;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
}
