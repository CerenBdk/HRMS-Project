package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCVDto;

public interface JobseekerService {

	Result add(Jobseeker jobseeker);
	Result update(Jobseeker jobseeker);
	Result delete(int id);
	DataResult<Jobseeker> getById(int id);
	
	DataResult<List<Jobseeker>> getAll();
	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);
	DataResult<JobSeekerCVDto> getJobseekerCVById(int id);
}
