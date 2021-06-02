package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.ProgrammingSkillForCV;

public interface ProgrammingSkillForCVDao extends JpaRepository<ProgrammingSkillForCV, Integer>{
	ProgrammingSkillForCV getById(int id);
	List<ProgrammingSkillForCV> getAllByJobseeker_id(int id);
}
