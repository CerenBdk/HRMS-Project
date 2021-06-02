package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ExperienceForCV;

public interface ExperienceForCVDao extends JpaRepository<ExperienceForCV, Integer>{
	ExperienceForCV getById(int id);
	List<ExperienceForCV> getAllByJobseeker_idOrderByEndAtDesc(int id);
	List<ExperienceForCV> getAllByJobseeker_id(int id);
}
