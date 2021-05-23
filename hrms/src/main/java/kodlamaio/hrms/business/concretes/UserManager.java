package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

//	@Override
//	public void add(User user) {
//		this.userDao.save(user);
//	}
//
//	@Override
//	public void update(User user) {
//		this.userDao.save(user);
//	}
//
//	@Override
//	public void delete(int id) {
//		this.userDao.deleteById(id);
//	}
//
//	@Override
//	public User getById(int id) {
//		return this.userDao.getOne(id);
//	}

	@Override
	public List<User> getAll() {
		return this.userDao.findAll();
	}

}
