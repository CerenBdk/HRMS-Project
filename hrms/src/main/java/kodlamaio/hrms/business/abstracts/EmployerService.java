package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {

//	void add(Employer employer);
//	void update(Employer employer);
//	void delete(int id);
//	Employer getById(int id);
	
	List<Employer> getAll();
}
