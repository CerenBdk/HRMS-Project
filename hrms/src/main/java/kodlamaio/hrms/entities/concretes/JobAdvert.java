package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "job_position_id")
//	private int jobPositionId;
	
//	@Column(name = "employer_id")
//	private int employerId;
	
//	@Column(name = "city_id")
//	private int cityId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "published_at")
	private LocalDate publishedAt;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Column(name= "created_at", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdAt = LocalDate.now();
	
	@Column(name= "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name= "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;

	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	public JobAdvert(int id, String description, int salaryMin, int salaryMax, int openPositionCount,
			LocalDate deadline, LocalDate publishedAt, boolean isOpen, JobPosition jobPosition, Employer employer,
			City city) {
		super();
		this.id = id;
		this.description = description;
		this.salaryMin = salaryMin;
		this.salaryMax = salaryMax;
		this.openPositionCount = openPositionCount;
		this.deadline = deadline;
		this.publishedAt = publishedAt;
		this.isOpen = isOpen;
		this.jobPosition = jobPosition;
		this.employer = employer;
		this.city = city;
	}
}
