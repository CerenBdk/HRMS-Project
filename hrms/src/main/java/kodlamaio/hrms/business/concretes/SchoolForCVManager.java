package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolForCVDao;
import kodlamaio.hrms.entities.concretes.SchoolForCV;

@Service
public class SchoolForCVManager implements SchoolForCVService{

	private SchoolForCVDao schoolForCVDao;
		
	@Autowired
	public SchoolForCVManager(SchoolForCVDao schoolForCVDao) {
		super();
		this.schoolForCVDao = schoolForCVDao;
	}

	@Override
	public Result add(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("School has been added.");
	}

	@Override
	public Result update(SchoolForCV schoolForCV) {
		this.schoolForCVDao.save(schoolForCV);
		return new SuccessResult("School has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolForCVDao.deleteById(id);
		return new SuccessResult("School has been deleted.");
	}

	@Override
	public DataResult<SchoolForCV> getById(int id) {
		return new SuccessDataResult<SchoolForCV>(this.schoolForCVDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAll() {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.findAll());
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<SchoolForCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<SchoolForCV>>(this.schoolForCVDao.getAllByJobseeker_id(id));
	}

}
