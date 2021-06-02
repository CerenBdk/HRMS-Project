package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;

public interface ForeignLanguageForCVService {
	Result add(ForeignLanguageForCV foreignLanguageForCV);
	Result update(ForeignLanguageForCV foreignLanguageForCV);
	Result delete(int id);
	DataResult<ForeignLanguageForCV> getById(int id);	
	DataResult<List<ForeignLanguageForCV>> getAll();
	DataResult<List<ForeignLanguageForCV>> getAllByJobseekerId(int id);
}
