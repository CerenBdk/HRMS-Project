package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CoverLetterForCV;

public interface CoverLetterForCvDao extends JpaRepository<CoverLetterForCV, Integer>{
	CoverLetterForCV getById(int id);
}
