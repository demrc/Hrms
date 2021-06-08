package hrms.hrms.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.ExperienceService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.ExperienceDao;
import hrms.hrms.entities.concretes.Experience;
@Service
public class ExperienceManager implements ExperienceService{
	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceService experienceService) {
		super();
		this.experienceDao=experienceDao;
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult();
	}

	@Override
	public Result update(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult();
		
	}

	@Override
	public Result delete(int id) {
		this.experienceDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		return new SuccessDataResult<List<Experience>>
		(this.experienceDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<Experience> getById(int id) {
		return new SuccessDataResult<Experience>
		(this.experienceDao.getById(id),"Data listed");
	}

	@Override
	public DataResult<List<Experience>> getByDate(Date finishDate) {
		return new SuccessDataResult<List<Experience>>
		(this.experienceDao.getByDate(finishDate),"Data listed");
	}

	@Override
	public DataResult<List<Experience>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<Experience>>
		(this.experienceDao.getByJobSeekerId(id),"Data listed");
	}
	
}
