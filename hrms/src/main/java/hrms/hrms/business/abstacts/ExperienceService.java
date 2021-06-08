package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Experience;

import java.sql.Date;
import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;

public interface ExperienceService {

	Result add(Experience experience);
	Result update(Experience experience);
	Result delete(int id);
	
	DataResult<List<Experience>> getAll();
	DataResult<Experience> getById(int id);
	DataResult<List<Experience>> getByDate(Date finishDate);
	DataResult<List<Experience>> getByJobSeekerId(int id);
}
