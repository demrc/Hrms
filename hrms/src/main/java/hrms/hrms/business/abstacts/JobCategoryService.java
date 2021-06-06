package hrms.hrms.business.abstacts;
import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobCategory;

public interface JobCategoryService {
	DataResult<List<JobCategory>> getAll();
	Result add(JobCategory jobCategory);
}
