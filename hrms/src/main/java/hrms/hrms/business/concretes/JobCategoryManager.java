package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.JobCategoryService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobCategoryDao;
import hrms.hrms.entities.concretes.JobCategory;

@Service
public class JobCategoryManager implements JobCategoryService {

	private JobCategoryDao jobDao;
	
	@Autowired
	public JobCategoryDao getJobDao() {
		return jobDao;
	}

	

	@Override
	public DataResult<List<JobCategory>> findByName(String name) {
		return new SuccessDataResult<List<JobCategory>>(this.jobDao.findAll(),"Data Listed.");
	}



	@Override
	public Result add(JobCategory jobCategory) {
		if(jobDao.findById(jobCategory.getId()).stream().count() != 0){
            return new ErrorResult();
        } 
		this.jobDao.save(jobCategory);
		// TODO Auto-generated method stub
		return new SuccessResult();
	}
	

}
