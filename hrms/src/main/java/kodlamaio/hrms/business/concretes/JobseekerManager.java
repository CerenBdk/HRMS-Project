package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;


@Service
public class JobseekerManager implements JobseekerService{

	private JobseekerDao jobseekerDao;
	
	@Autowired
	public JobseekerManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}

//	@Override
//	public void add(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//	}
//
//	@Override
//	public void update(Jobseeker jobseeker) {
//		this.jobseekerDao.save(jobseeker);
//	}
//
//	@Override
//	public void delete(int id) {
//		this.jobseekerDao.deleteById(id);;
//	}
//
//	@Override
//	public Jobseeker getById(int id) {
//		return this.jobseekerDao.getOne(id);
//	}

	@Override
	public List<Jobseeker> getAll() {
		return this.jobseekerDao.findAll();
	}

}
