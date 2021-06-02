package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {

	private ForeignLanguageForCVService foreignLanguageForCVService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageForCVService foreignLanguageForCVService) {
		super();
		this.foreignLanguageForCVService = foreignLanguageForCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguageForCV foreignLanguageForCV){
		return this.foreignLanguageForCVService.add(foreignLanguageForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ForeignLanguageForCV foreignLanguageForCV){
		return this.foreignLanguageForCVService.update(foreignLanguageForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.foreignLanguageForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ForeignLanguageForCV> getById(@RequestParam("id") int id){
		return this.foreignLanguageForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ForeignLanguageForCV>> getAll(){
		return this.foreignLanguageForCVService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<ForeignLanguageForCV>> getAllByJobseekerId(@RequestParam int id){
		return this.foreignLanguageForCVService.getAllByJobseekerId(id);
	}
}
