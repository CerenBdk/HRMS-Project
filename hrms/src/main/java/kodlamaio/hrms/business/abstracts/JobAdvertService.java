package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {

	Result add(JobAdvert jobAdvert);
	Result update(JobAdvert jobAdvert);
	Result delete(int id);
	Result changeOpenToClose(int id);
	DataResult<JobAdvert> getById(int id);	
	DataResult<List<JobAdvert>> getAll();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvert>> findAllByOrderByPublishedAt();
	DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id);
}
