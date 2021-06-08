package hrms.hrms.business.abstacts;

import java.sql.Date;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.DataResult;
import java.util.List;

import hrms.hrms.entities.concretes.School;

public interface SchoolService {
	
	Result add(School school);
	Result update(School school);
	Result delete(int id);

	DataResult<List<School>> getAll();
	DataResult<School> getById(int id);
	DataResult<List<School>> getByDate(Date finishDate);
}
