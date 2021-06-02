package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_cover_letters")
@NoArgsConstructor
public class CoverLetterForCV extends Base{
	
	@Column(name = "content")
	private String content;
	
	public CoverLetterForCV(String content, int jobseekerId) {
		super();
		this.content = content;
		this.jobseeker.setId(jobseekerId);
	}

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	@JsonIgnore
	private Jobseeker jobseeker;
	
}
