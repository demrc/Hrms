package hrms.hrms.core.utilities.adapters.concretes;

import hrms.hrms.core.utilities.adapters.abstracts.MernisValidationService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.JobSeeker;

public class MernisValidationManager implements MernisValidationService{

	@Override
	public Result mernisValidation(JobSeeker jobSeeker) {
		if(!(jobSeeker.getS_nationalid().length()==11)) {
			System.out.println("Enter a valid value.");
		}
		if(jobSeeker.getS_firstname().length()==0) {
		System.out.println("Enter a valid name.");
		}
		if(jobSeeker.getS_lastname().length()==0) {
			System.out.println("Enter a valid name.");
		}
		if(jobSeeker.getS_dateofbirth().before(null)) {
			System.out.println("Enter a valid date.");
		}
		return new SuccessResult();
	}

	@Override
	public void mernisValidation() {
		// TODO Auto-generated method stub
		
	}

}
