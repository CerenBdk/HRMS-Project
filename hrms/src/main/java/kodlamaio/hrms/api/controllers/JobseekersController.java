package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobseekersController {

	private JobseekerService jobseekerService;

	@Autowired
	public JobseekersController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}
	
	
//	@PostMapping("/add")
//	public void add(@RequestBody Jobseeker jobseeker){
//		this.jobseekerService.add(jobseeker);
//	}
//	
//	@PostMapping("/update")
//	public void update(@RequestBody Jobseeker jobseeker){
//		this.jobseekerService.update(jobseeker);
//	}
//	
//	@PostMapping("/delete")
//	public void delete(@PathVariable("id") int id){
//		this.jobseekerService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public Jobseeker getById(@PathVariable("id") int id){
//		return this.jobseekerService.getById(id);
//	}
	
	@GetMapping("/getall")
	public List<Jobseeker> getAll(){
		return this.jobseekerService.getAll();
	}
	
}
