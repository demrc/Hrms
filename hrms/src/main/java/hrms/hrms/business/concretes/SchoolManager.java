package hrms.hrms.business.concretes;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.SchoolService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.SchoolDao;
import hrms.hrms.entities.concretes.School;

@Service
public class SchoolManager implements SchoolService {

	private SchoolDao schoolDao;
	@Autowired
	public SchoolManager(SchoolService schoolService) {
		super();
		this.schoolDao=schoolDao;
	}
	
	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult();
	}

	@Override
	public Result update(School school) {
		this.schoolDao.save(school);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.schoolDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<School> getById(int id) {
		return new SuccessDataResult<School>
		(this.schoolDao.getById(id),"Data listed");
	}

	@Override
	public DataResult<List<School>> getByDate(Date finishDate) {
		return new SuccessDataResult<List<School>>
		(this.schoolDao.getByDate(finishDate),"Data listed");
	}

}
