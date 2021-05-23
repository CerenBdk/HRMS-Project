package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
//	
//	@PostMapping("/add")
//	public void add(@RequestBody JobPosition jobPosition){
//		this.jobPositionService.add(jobPosition);
//	}
//	
//	@PostMapping("/update")
//	public void update(@RequestBody JobPosition jobPosition){
//		this.jobPositionService.update(jobPosition);
//	}
//	
//	@PostMapping("/delete")
//	public void delete(@PathVariable("id") int id){
//		this.jobPositionService.delete(id);
//	}
//	
//	@GetMapping("/getbyid")
//	public JobPosition getById(@PathVariable("id") int id){
//		return this.jobPositionService.getById(id);
//	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
}
