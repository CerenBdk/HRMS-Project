package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.net.MediaType;

import kodlamaio.hrms.business.abstracts.ImageForCVService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.ImageForCV;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	
	private ImageForCVService imageForCVService;
	private JobseekerService jobseekerService;

	@Autowired
	public ImagesController(ImageForCVService imageForCVService, JobseekerService jobseekerService) {
		super();
		this.imageForCVService = imageForCVService;
		this.jobseekerService = jobseekerService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		Jobseeker jobseeker = this.jobseekerService.getById(id).getData();
		ImageForCV imageForCV = new ImageForCV();
		imageForCV.setJobseeker(jobseeker);
		return this.imageForCVService.add(imageForCV, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ImageForCV imageForCV){
		return this.imageForCVService.update(imageForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.imageForCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ImageForCV> getById(@RequestParam("id") int id){
		return this.imageForCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ImageForCV>> getAll(){
		return this.imageForCVService.getAll();
	}
	
	
	@GetMapping("/getByJobseekerId")
	public DataResult<ImageForCV> getByJobseekerId(@RequestParam int id){
		return this.imageForCVService.getByJobseekerId(id);
	}
}
