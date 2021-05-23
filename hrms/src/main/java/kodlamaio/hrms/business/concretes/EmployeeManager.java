package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService{

	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

//	@Override
//	public void add(Employee employee) {
//		this.employeeDao.save(employee);
//	}
//
//	@Override
//	public void update(Employee employee) {
//		this.employeeDao.save(employee);
//	}
//
//	@Override
//	public void delete(int id) {
//		this.employeeDao.deleteById(id);
//	}
//
//	@Override
//	public Employee getById(int id) {
//		return this.employeeDao.getOne(id);
//	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

}
