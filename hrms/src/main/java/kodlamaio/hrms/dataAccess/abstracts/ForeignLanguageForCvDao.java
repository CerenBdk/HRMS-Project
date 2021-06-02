package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCvDao extends JpaRepository<ForeignLanguageForCV, Integer>{
	ForeignLanguageForCV getById(int id);
	List<ForeignLanguageForCV> getAllByJobseeker_id(int id);
}
