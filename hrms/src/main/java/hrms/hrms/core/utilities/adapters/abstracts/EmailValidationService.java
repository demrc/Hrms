package hrms.hrms.core.utilities.adapters.abstracts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.User;

public interface EmailValidationService {
		Result Control(User user);
		boolean checkIsRealEmail(String email);
	
}
