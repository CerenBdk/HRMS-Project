package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {

	Result add(VerificationCode code);
//	Result delete(VerificationCode code);
//	Result update(VerificationCode code);
//	
//    DataResult<VerificationCode> getById(int id);
//	DataResult<List<VerificationCode>> getAll();
	
	
}
