package hrms.hrms.core.utilities.adapters.abstracts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobSeeker;

public interface MernisValidationService {
	public void mernisValidation();

	Result mernisValidation(JobSeeker jobSeeker);
}
