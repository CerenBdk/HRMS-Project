package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ExperienceForCVDao;
import kodlamaio.hrms.entities.concretes.ExperienceForCV;

@Service
public class ExperienceForCVManager implements ExperienceForCVService{

	private ExperienceForCVDao experienceForCVDao;
	
	@Autowired
	public ExperienceForCVManager(ExperienceForCVDao experienceForCVDao) {
		super();
		this.experienceForCVDao = experienceForCVDao;
	}

	@Override
	public Result add(ExperienceForCV experienceForCV) {
		this.experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience has been added.");
	}

	@Override
	public Result update(ExperienceForCV experienceForCV) {
		this.experienceForCVDao.save(experienceForCV);
		return new SuccessResult("Experience has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.experienceForCVDao.deleteById(id);
		return new SuccessResult("Experience has been deleted.");
	}

	@Override
	public DataResult<ExperienceForCV> getById(int id) {
		return new SuccessDataResult<ExperienceForCV>(this.experienceForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAll() {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.findAll());
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<ExperienceForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ExperienceForCV>>(this.experienceForCVDao.getAllByJobseeker_id(id));
	}
}
