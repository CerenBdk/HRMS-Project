package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.entities.concretes.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentsController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentsController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Department department){
		this.departmentService.add(department);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Department department){
		this.departmentService.update(department);
	}
	
	@PostMapping("/delete")
	public void delete(@PathVariable("id") int id){
		this.departmentService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public Department getById(@PathVariable("id") int id){
		return this.departmentService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Department> getAll(){
		return this.departmentService.getAll();
	}
	
}
