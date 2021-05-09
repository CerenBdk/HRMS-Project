package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;
	
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public void add(Department department) {
		this.departmentDao.save(department);
	}

	@Override
	public void update(Department department) {
		this.departmentDao.save(department);
	}

	@Override
	public void delete(int id) {
		this.departmentDao.deleteById(id);
	}

	@Override
	public Department getById(int id) {
		return this.departmentDao.getOne(id);
	}

	@Override
	public List<Department> getAll() {
		return this.departmentDao.findAll();
	}

}
