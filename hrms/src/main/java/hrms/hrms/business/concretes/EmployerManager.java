package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.core.utilities.adapters.abstracts.EmailValidationService;
import hrms.hrms.business.abstacts.EmployerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EmployerDao;
import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.User;

@Service
public class EmployerManager implements EmployerService {


	private EmployerDao employerDao;
	private EmailValidationService emailValidationService;
	private UserDao userDao;
	
	
	@Autowired
	public EmployerManager(UserDao userDao, EmployerDao employerDao, EmailValidationService emailValidationService) {
		super();

		this.userDao=userDao;
		
		this.employerDao = employerDao;
		this.emailValidationService = emailValidationService;
	}

	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listed.");
	}

	@Override
	public Result add(Employer employer,User users) {
		boolean  result=  emailValidationService.checkIsRealEmail(users.getEmail());
		if(result==false){
			return new ErrorResult();
		}
		else {
		return new SuccessResult();
	}
	}


	@Override
	public Result Login(String email, String password) {
		for (int i = 0; i < employerDao.findAll().size(); i++) {
			if (userDao.findAll().get(i).getEmail() == email
					&& userDao.findAll().get(i).getPassword() == password) {
				return new ErrorResult();
			}
		}
		return new SuccessResult();
	}


	@Override
	public Result Register(Employer employer, User user) {
		if(IsEmailUsed(user.getEmail())) {
			emailValidationService.checkIsRealEmail(user.getEmail());
			
			this.employerDao.save(employer);
			return new SuccessResult();
		}
		return new ErrorResult();
	}


	private boolean IsEmailUsed(String email) {
		
		
		return false;
		
	}



}
