package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceForCVService;
import kodlamaio.hrms.business.abstracts.ForeignLanguageForCVService;
import kodlamaio.hrms.business.abstracts.ImageForCVService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.LinkForCVService;
import kodlamaio.hrms.business.abstracts.ProgrammingSkillForCVService;
import kodlamaio.hrms.business.abstracts.SchoolForCVService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.dtos.JobSeekerCVDto;
import net.bytebuddy.asm.Advice.This;

@Service
public class JobseekerManager implements JobseekerService {

	private JobseekerDao jobseekerDao;
	private ExperienceForCVService experienceForCVService;
	private ForeignLanguageForCVService foreignLanguageForCVService;
	private ImageForCVService imageForCVService;
	private LinkForCVService linkForCVService;
	private ProgrammingSkillForCVService programmingSkillForCVService;
	private SchoolForCVService schoolForCVService;

	public JobseekerManager(JobseekerDao jobseekerDao, ExperienceForCVService experienceForCVService,
			ForeignLanguageForCVService foreignLanguageForCVService, ImageForCVService imageForCVService,
			LinkForCVService linkForCVService, ProgrammingSkillForCVService programmingSkillForCVService,
			SchoolForCVService schoolForCVService) {
		super();
		this.jobseekerDao = jobseekerDao;
		this.experienceForCVService = experienceForCVService;
		this.foreignLanguageForCVService = foreignLanguageForCVService;
		this.imageForCVService = imageForCVService;
		this.linkForCVService = linkForCVService;
		this.programmingSkillForCVService = programmingSkillForCVService;
		this.schoolForCVService = schoolForCVService;
	}

	@Override
	public Result add(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public Result update(Jobseeker jobseeker) {
		this.jobseekerDao.save(jobseeker);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobseekerDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<Jobseeker> getById(int id) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.getById(id));
	}

	@Override
	public DataResult<List<Jobseeker>> getAll() {
		return new SuccessDataResult<List<Jobseeker>>(this.jobseekerDao.findAll());
	}

	@Override
	public DataResult<Jobseeker> getJobseekerByNationalId(String nationalId) {
		return new SuccessDataResult<Jobseeker>(this.jobseekerDao.findJobseekerByNationalId(nationalId));
	}

	@Override
	public DataResult<JobSeekerCVDto> getJobseekerCVById(int id) {
		Jobseeker jobseeker = this.jobseekerDao.getById(id);
		JobSeekerCVDto cv = new JobSeekerCVDto();
		cv.experiences = jobseeker.getExperiences();
		cv.languages = jobseeker.getLanguages();
		cv.image = jobseeker.getImage();
		cv.links = jobseeker.getLinks();
		cv.programingSkills = jobseeker.getProgramingSkills();
		cv.schools = jobseeker.getSchools();
		return new SuccessDataResult<JobSeekerCVDto>(cv);
	}

}
