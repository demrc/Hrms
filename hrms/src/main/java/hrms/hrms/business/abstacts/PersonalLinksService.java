package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.PersonalLinks;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
public interface PersonalLinksService {

	Result add(PersonalLinks personalLinks);
	Result update(PersonalLinks personalLinks);
	Result delete(int id);
	
	DataResult<List<PersonalLinks>> getAll();
	DataResult<PersonalLinks> getById(int id);
	DataResult<List<PersonalLinks>> getByJobSeekerId(int id);
}
