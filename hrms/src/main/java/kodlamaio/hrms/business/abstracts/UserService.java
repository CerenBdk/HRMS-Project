package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	Result add(User user);
//	Result update(User user);
//	Result delete(int id);
//	DataResult<User> getById(int id);
	
	DataResult<List<User>> getAll();
	DataResult<User> getUserByEmail(String email);
}
