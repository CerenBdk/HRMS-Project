package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.Jobseeker;


public interface AuthService {
	
	Result registerEmployer(Employer employer, String confirmPassword);
	Result registerJobseeker(Jobseeker jobseeker, String confirmPassword);

}
