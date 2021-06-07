package hrms.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.hrms.core.utilities.results.SuccessResult;

import hrms.hrms.business.abstacts.EmployerVerificationService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.dataAccess.abstracts.EmployerVerificationDao;
import hrms.hrms.entities.concretes.EmployerVerification;

@Service
public class EmployerVerificationManager implements EmployerVerificationService{

	private EmployerVerificationDao employerVerificationDao;
	
	@Autowired
	public EmployerVerificationManager() {
		
	}
	
	@Override
	public Result add(EmployerVerification employerVerification) {
		
		return new SuccessResult();
	}

}
