package hrms.hrms.business.abstacts;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.User;

public interface UserService {

	DataResult<List<User>> getAll();
	DataResult<User> add(User user);
}
