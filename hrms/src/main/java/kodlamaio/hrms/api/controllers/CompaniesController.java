package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CompanyService;
import kodlamaio.hrms.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

	private CompanyService companyService;

	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	
	@PostMapping("/add")
	public void add(Company company){
		this.companyService.add(company);
	}
	
	@PostMapping("/update")
	public void update(Company company){
		this.companyService.update(company);
	}
	
	@PostMapping("/delete")
	public void delete(Company company){
		this.companyService.add(company);
	}
	
	@GetMapping("/getbyid")
	public Company getById(int id){
		return this.companyService.getById(id);
	}
	
	@GetMapping("/getall")
	public List<Company> getAll(){
		return this.companyService.getAll();
	}
}
