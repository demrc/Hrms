package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.EmployerService;
import hrms.hrms.core.utilities.adapters.abstracts.EmailValidationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.EmployerDao;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {


	private EmployerDao employerDao;
	private EmailValidationService emailValidationService;
	
	
	@Autowired
	public EmployerManager(UserDao userDao, EmployerDao employerDao, EmailValidationService emailValidationService) {
		super();

		this.employerDao = employerDao;
		this.emailValidationService = emailValidationService;
	}

	
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listed.");
	}

	@Override
	public Result add(Employer employer) {
		boolean  result = emailValidationService.checkIsRealEmail(employer.getC_email());
		if(result==false){
			return new ErrorResult();
		}
		else {
		return new SuccessResult();
	}
	}



}
