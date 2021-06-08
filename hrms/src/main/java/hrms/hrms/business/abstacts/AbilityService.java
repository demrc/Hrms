package hrms.hrms.business.abstacts;

import java.util.List;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.DataResult;

import hrms.hrms.entities.concretes.Ability;

public interface AbilityService {

	Result add(Ability ability);
	Result delete(Ability ability);
	Result update(Ability ability);
	DataResult<List<Ability>> getAll();
	DataResult<Ability> getById(int id);
	DataResult<List<Ability>> getByJobSeekerId(int id);
	
}
