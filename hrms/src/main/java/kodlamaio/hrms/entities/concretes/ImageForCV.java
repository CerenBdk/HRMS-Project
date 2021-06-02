package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_images")
@NoArgsConstructor
@AllArgsConstructor
public class ImageForCV extends Base{

	@Column(name = "url")
	private String url;	

	@OneToOne(optional=false,fetch=FetchType.LAZY)
    @JoinColumn(name = "jobseeker_id", referencedColumnName = "user_id")
	private Jobseeker jobseeker;
	
	
}
