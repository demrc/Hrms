package hrms.hrms.business.abstacts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.User;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer, User users);
	
	public Result Login(String email, String password);
	public Result Register(Employer employer, User user);
}
