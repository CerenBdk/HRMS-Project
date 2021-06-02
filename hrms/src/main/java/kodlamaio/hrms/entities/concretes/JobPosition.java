package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_positions")
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
public class JobPosition extends Base{
	
	@Column(name="job_title")
	private String jobTitle;

	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert> jobAdverts;

	public JobPosition(String jobTitle, List<JobAdvert> jobAdverts) {
		super();
		this.jobTitle = jobTitle;
		this.jobAdverts = jobAdverts;
	} 
		
}
