package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Company;

public interface CompanyService {

	void add(Company company);
	void update(Company company);
	void delete(int id);
	Company getById(int id);
	List<Company> getAll();
}
