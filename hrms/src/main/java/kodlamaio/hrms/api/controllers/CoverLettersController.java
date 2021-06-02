package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CoverLetterForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetterForCV;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLettersController {

	private CoverLetterForCVService coverLetterForCVService;

	@Autowired
	public CoverLettersController(CoverLetterForCVService coverLetterForCVService) {
		super();
		this.coverLetterForCVService = coverLetterForCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterForCV coverLetterForCV){
		return this.coverLetterForCVService.add(coverLetterForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterForCV coverLetterForCV){
		return this.coverLetterForCVService.update(coverLetterForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.coverLetterForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CoverLetterForCV> getById(@RequestParam("id") int id){
		return this.coverLetterForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetterForCV>> getAll(){
		return this.coverLetterForCVService.getAll();
	}
	
}
