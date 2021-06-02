package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LinkForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LinkForCV;

@RestController
@RequestMapping("/api/links")
public class LinksController {
	
	private LinkForCVService linkForCVService;

	@Autowired
	public LinksController(LinkForCVService linkForCVService) {
		super();
		this.linkForCVService = linkForCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LinkForCV linkForCV){
		return this.linkForCVService.add(linkForCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody LinkForCV linkForCV){
		return this.linkForCVService.update(linkForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.linkForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<LinkForCV> getById(@RequestParam("id") int id){
		return this.linkForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<LinkForCV>> getAll(){
		return this.linkForCVService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<LinkForCV>> getAllByJobseekerId(@RequestParam int id){
		return this.linkForCVService.getAllByJobseekerId(id);
	}
}
