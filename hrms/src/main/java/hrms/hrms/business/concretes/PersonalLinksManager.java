package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.PersonalLinksService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.PersonalLinksDao;
import hrms.hrms.entities.concretes.PersonalLinks;

@Service
public class PersonalLinksManager implements PersonalLinksService{
	private PersonalLinksDao personalLinksDao;
	@Autowired
	public PersonalLinksManager(PersonalLinksService personalLinksService) {
		super();
		this.personalLinksDao=personalLinksDao;
	}

	@Override
	public Result add(PersonalLinks personalLinks) {
		this.personalLinksDao.save(personalLinks);
		return new SuccessResult();
	}

	@Override
	public Result update(PersonalLinks personalLinks) {
		this.personalLinksDao.save(personalLinks);
		return new SuccessResult();
	
	}

	@Override
	public Result delete(int id) {
		this.personalLinksDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<PersonalLinks>> getAll() {
		return new SuccessDataResult<List<PersonalLinks>>
		(this.personalLinksDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<PersonalLinks> getById(int id) {
		return new SuccessDataResult<PersonalLinks>
		(this.personalLinksDao.getById(id),"Data listed");
	}

	@Override
	public DataResult<List<PersonalLinks>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<PersonalLinks>>
		(this.personalLinksDao.getByJobSeekerId(id),"Data listed");
	}
	
}
