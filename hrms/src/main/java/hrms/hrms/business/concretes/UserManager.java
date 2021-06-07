package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;


import hrms.hrms.business.abstacts.UserService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserDao userDao() {
		return userDao;
	}
	
	@Override
	public DataResult<List<User>> findByEmail(String email) {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data Listed.");
	}

	@Override
	public Result add(User users) {
		this.userDao.save(users);
		return new SuccessResult();
	}

	
}
