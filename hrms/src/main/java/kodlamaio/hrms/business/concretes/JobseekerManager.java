package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import net.bytebuddy.asm.Advice.This;


@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
      return new SuccessResult("Jobseeker has been added.");
	}
//
//	@Override
//	public Result update(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//      return new SuccessResult("Jobseeker has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobseekerDao.deleteById(id);
//      return new SuccessResult("Jobseeker has been deleted.");
//	}
//
//	@Override
//	public DataResult<Jobseeker> getById(int id) {
//		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getOne(id));
//	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

}
