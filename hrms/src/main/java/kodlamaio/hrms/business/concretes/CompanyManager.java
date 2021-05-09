package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import kodlamaio.hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public void add(@RequestBody Company company) {
		this.companyDao.save(company);
	}

	@Override
	public void update(@RequestBody Company company) {
		this.companyDao.save(company);
	}

	@Override
	public void delete(@PathVariable("id") int id) {
		this.companyDao.deleteById(id);
	}

	@Override
	public Company getById(@PathVariable("id") int id) {
		return this.companyDao.getOne(id);
	}

	@Override
	public List<Company> getAll() {
		return this.companyDao.findAll();
	}

}
