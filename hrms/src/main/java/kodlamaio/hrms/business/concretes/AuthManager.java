package kodlamaio.hrms.business.concretes;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.Jobseeker;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class AuthManager implements AuthService {

	private UserService userService;
	private EmployerService employerService;
	private JobseekerService jobseekerService;

	@Autowired
	public AuthManager(UserService userService, EmployerService employerService, JobseekerService jobseekerService) {
		super();
		this.userService = userService;
		this.employerService = employerService;
		this.jobseekerService = jobseekerService;
	}

	@Override
	public Result registerEmployer(Employer employer) {

		if (!checkIfNullInfoForEmployer(employer)) {

			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}

		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebsite())) {

			return new ErrorResult("Invalid email address.");
		}

		if (!checkIfEmailExists(employer.getEmail())) {

			return new ErrorResult(employer.getEmail() + " already exists.");
		}

		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), employer.getConfirmPassword())) {

			return new ErrorResult("Passwords do not match.");
		}

		employerService.add(employer);

		return new SuccessResult("Registration has been successfully completed");

	}

	@Override
	public Result registerJobseeker(Jobseeker jobseeker) {

		if (!checkIfNullInfoForJobseeker(jobseeker)) {

			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}
		
		if(!checkIfExistsTcNo(jobseeker.getNationalId())) {
			
			return new ErrorResult(jobseeker.getNationalId() + " already exists.");
		}
		
		if (!checkIfEmailExists(jobseeker.getEmail())) {

			return new ErrorResult(jobseeker.getEmail() + " already exists.");
		}

		jobseekerService.add(jobseeker);
		return new SuccessResult("Registration has been successfully completed");
	}

	// Validation for employer register ---START---

	private boolean checkIfNullInfoForEmployer(Employer employer) {

		if (employer.getCompanyName() != null && employer.getWebsite() != null && employer.getEmail() != null
				&& employer.getPhoneNumber() != null && employer.getPassword() != null
				&& employer.getConfirmPassword() != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4, website.length());

		if (emailArr[1].equals(domain)) {

			return true;
		}

		return false;
	}


	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {

		if (!password.equals(confirmPassword)) {
			return false;
		}

		return true;
	}

	// Validation for employer register ---END---

	// Validation for jobseeker register ---START---
	private boolean checkIfNullInfoForJobseeker(Jobseeker jobseeker) {

		if (jobseeker.getFirstName() != null && jobseeker.getLastName() != null && jobseeker.getNationalId() != null
				&& jobseeker.getDateOfBirth() != null && jobseeker.getPassword() != null
				&& jobseeker.getConfirmPassword() != null && jobseeker.getEmail() != null) {

			return true;

		}

		return false;
	}

	private boolean checkIfExistsTcNo(String nationalId) {

		if(this.jobseekerService.getJobseekerByNationalId(nationalId).getData() == null ) {
			return true;
		}
		return false;
	}

	// Validation for jobseeker register ---END---
	
	// Common Validation
	

	private boolean checkIfEmailExists(String email) {

		if (this.userService.getUserByEmail(email).getData() == null) {

			return true;
		}

		return false;
	}
}
