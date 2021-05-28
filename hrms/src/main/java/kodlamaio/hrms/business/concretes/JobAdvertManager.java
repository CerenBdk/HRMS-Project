package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService{

	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
	    return new SuccessResult("Job advert has been added.");
	}

//	@Override
//	public Result update(JobAdvert jobAdvert) {
//		this.jobAdvertDao.save(jobAdvert);
//	    return new SuccessResult("Job advert has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobAdvertDao.deleteById(id);
//	    return new SuccessResult("Job advert has been deleted.");
//	}
//
//	@Override
//	public DataResult<JobAdvert> getById(int id) {
//		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getOne(id));
//	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}


}
