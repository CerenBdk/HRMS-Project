package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SchoolForCV;

public interface SchoolForCVDao extends JpaRepository<SchoolForCV, Integer>{
	SchoolForCV getById(int id);
	List<SchoolForCV> getAllByJobseeker_idOrderByEndAtDesc(int id);
	List<SchoolForCV> getAllByJobseeker_id(int id);
}
