package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
//import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeService {

//	Result add(Employee employee);
//	Result update(Employee employee);
//	Result delete(int id);
//	DataResult<Employee> getById(int id);
	
	DataResult<List<Employee>> getAll();
}
