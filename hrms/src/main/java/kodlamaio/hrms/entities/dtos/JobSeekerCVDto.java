package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.ExperienceForCV;
import kodlamaio.hrms.entities.concretes.ForeignLanguageForCV;
import kodlamaio.hrms.entities.concretes.ImageForCV;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.LinkForCV;
import kodlamaio.hrms.entities.concretes.ProgrammingSkillForCV;
import kodlamaio.hrms.entities.concretes.SchoolForCV;

public class JobSeekerCVDto {

	public Jobseeker jobseeker;
	public List<SchoolForCV> schools;
	public List<ProgrammingSkillForCV> programingSkills;
	public List<LinkForCV> links;
	public List<ForeignLanguageForCV> languages;
	public List<ExperienceForCV> experiences;
	public ImageForCV image;
}
