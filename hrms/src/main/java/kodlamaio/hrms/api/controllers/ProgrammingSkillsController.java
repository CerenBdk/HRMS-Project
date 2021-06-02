package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ProgrammingSkillForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ProgrammingSkillForCV;

@RestController
@RequestMapping("/api/programmingSkills")
public class ProgrammingSkillsController {
	
	private ProgrammingSkillForCVService programmingSkillForCVService;

	@Autowired
	public ProgrammingSkillsController(ProgrammingSkillForCVService programmingSkillForCVService) {
		super();
		this.programmingSkillForCVService = programmingSkillForCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkillForCV programmingSkillForCV){
		return this.programmingSkillForCVService.add(programmingSkillForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ProgrammingSkillForCV programmingSkillForCV){
		return this.programmingSkillForCVService.update(programmingSkillForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.programmingSkillForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ProgrammingSkillForCV> getById(@RequestParam("id") int id){
		return this.programmingSkillForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ProgrammingSkillForCV>> getAll(){
		return this.programmingSkillForCVService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ProgrammingSkillForCV>> getAllByJobseekerId(@RequestParam int id){
		return this.programmingSkillForCVService.getAllByJobseekerId(id);
	}
}
