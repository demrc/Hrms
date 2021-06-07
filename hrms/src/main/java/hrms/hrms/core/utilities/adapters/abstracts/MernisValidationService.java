package hrms.hrms.core.utilities.adapters.abstracts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobSeeker;

public interface MernisValidationService {
	public Result mernisValidation();

	public boolean checkIfRealPerson(JobSeeker jobSeeker);
}
