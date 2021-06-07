package hrms.hrms.core.utilities.adapters.concretes;

import org.springframework.stereotype.Service;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.core.utilities.adapters.abstracts.MernisValidationService;

import hrms.hrms.entities.concretes.JobSeeker;

@Service
public class MernisValidationManager implements MernisValidationService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		if(!(jobSeeker.getNationalid().length()==11)) {
			System.out.println("Enter a valid value.");
		}
		if(jobSeeker.getFirstname().length()==0) {
		System.out.println("Enter a valid name.");
		}
		if(jobSeeker.getLastname().length()==0) {
			System.out.println("Enter a valid name.");
		}
		if(jobSeeker.getDateofbirth().before(null)) {
			System.out.println("Enter a valid date.");
		}
		return true;
	}

	@Override
	public Result mernisValidation() {

		return new SuccessResult();
	}

}
