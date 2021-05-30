package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer>{

	@Query("From JobAdvert where isOpen = true")
	List<JobAdvert> getAllOpenJobAdvertList();
	
	@Query("From JobAdvert where isOpen = true Order By publishedAt Desc")
	List<JobAdvert> findAllByOrderByPublishedAtDesc();
	
	@Query("From JobAdvert where isOpen = true and employer_id =:id")
	List<JobAdvert> getAllOpenJobAdvertByEmployer(int id);
	
	JobAdvert getById(int id);
	
	
}
