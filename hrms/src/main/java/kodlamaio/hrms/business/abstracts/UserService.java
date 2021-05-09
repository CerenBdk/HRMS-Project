package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(int id);
	User getById(int id);
	List<User> getAll();
}
