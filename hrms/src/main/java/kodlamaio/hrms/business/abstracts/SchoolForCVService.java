package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolForCV;

public interface SchoolForCVService {
	Result add(SchoolForCV schoolForCV);
	Result update(SchoolForCV schoolForCV);
	Result delete(int id);
	DataResult<SchoolForCV> getById(int id);	
	DataResult<List<SchoolForCV>> getAll();
	DataResult<List<SchoolForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolForCV>> getAllByJobseekerId(int id);
}
