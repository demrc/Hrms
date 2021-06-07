package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.JobSeekerService;
import hrms.hrms.core.utilities.adapters.abstracts.EmailValidationService;
import hrms.hrms.core.utilities.adapters.abstracts.MernisValidationService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.JobSeekerDao;
import hrms.hrms.dataAccess.abstracts.UserDao;
import hrms.hrms.entities.concretes.JobSeeker;
import hrms.hrms.entities.concretes.User;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private UserDao userDao;
	private EmailValidationService emailValidationService;
	private MernisValidationService mernisValidationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, UserDao userDao, EmailValidationService emailValidationService,
			MernisValidationService mernisValidationService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.userDao = userDao;
		this.emailValidationService = emailValidationService;
		this.mernisValidationService = mernisValidationService;
	}

	
	

	@Override
	public DataResult<List<JobSeeker>> findByEmailAndNatiınaolId(String email, String nationalid) {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data Listed.");

	}

	@Override
	public Result add(JobSeeker jobSeeker,User user) {
		try {
			Result result1 = mernisValidationService.mernisValidation();
		} catch (Exception e) {
			// TODO: handle exception
		}
		boolean result2= emailValidationService.checkIsRealEmail(user.getEmail());
		if(result2==false) {
			return new ErrorResult();
		}
		
		
		return new SuccessResult();
	}




	@Override
	public Result Login(String email, String password) {
		
		for (int i = 0; i < jobSeekerDao.findAll().size(); i++) {
			if (userDao.findAll().get(i).getEmail() == email
					&& userDao.findAll().get(i).getPassword() == password) {
				return new ErrorResult();
			}
		}
		return new SuccessResult();
	}




	@Override
	public Result Register(JobSeeker jobSeeker,User user) {
		if(IsEmailUsed(user.getEmail())) {
			emailValidationService.checkIsRealEmail(user.getEmail());
			
			this.jobSeekerDao.save(jobSeeker);
			return new SuccessResult();
		}
		return new ErrorResult();
	}


	private boolean IsEmailUsed(String email) {
		
		
		return false;
		
	}




	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data Listed.");
	}
	
	
}
