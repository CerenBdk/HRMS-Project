package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {

//	void add(Jobseeker jobseeker);
//	void update(Jobseeker jobseeker);
//	void delete(int id);
//	Jobseeker getById(int id);
	
	List<Jobseeker> getAll();
}
