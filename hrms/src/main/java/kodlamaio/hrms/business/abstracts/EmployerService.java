package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

	Result add(Employer employer);
//	Result update(Employer employer);
//	Result delete(int id);
//	DataResult<Employer> getById(int id);
	
	DataResult<List<Employer>> getAll();
}
