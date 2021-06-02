package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ProgrammingSkillForCV;

public interface ProgrammingSkillForCVService {
	Result add(ProgrammingSkillForCV programmingSkillForCV);
	Result update(ProgrammingSkillForCV programmingSkillForCV);
	Result delete(int id);
	DataResult<ProgrammingSkillForCV> getById(int id);	
	DataResult<List<ProgrammingSkillForCV>> getAll();
	DataResult<List<ProgrammingSkillForCV>> getAllByJobseekerId(int id);
}
