package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ExperienceForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ExperienceForCV;

@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	
	private ExperienceForCVService experienceForCVService;

	@Autowired
	public ExperiencesController(ExperienceForCVService experienceForCVService) {
		super();
		this.experienceForCVService = experienceForCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ExperienceForCV experienceForCV){
		return this.experienceForCVService.add(experienceForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ExperienceForCV experienceForCV){
		return this.experienceForCVService.update(experienceForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.experienceForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ExperienceForCV> getById(@RequestParam int id){
		return this.experienceForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ExperienceForCV>> getAll(){
		return this.experienceForCVService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerIdOrderByEndAtDesc")
	public DataResult<List<ExperienceForCV>> getAllByJobseekerIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.experienceForCVService.getAllByJobseekerIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ExperienceForCV>> getAllByJobseekerId(@RequestParam int id){
		return this.experienceForCVService.getAllByJobseekerId(id);
	}
}
