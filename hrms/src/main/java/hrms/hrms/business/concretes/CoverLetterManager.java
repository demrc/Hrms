package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.CoverLetterService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.CoverLetterDao;
import hrms.hrms.entities.concretes.Ability;
import hrms.hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao coverLetterDao;
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao=coverLetterDao;
	}

	@Override
	public Result add(hrms.hrms.entities.concretes.CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result update(hrms.hrms.entities.concretes.CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.coverLetterDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<hrms.hrms.entities.concretes.CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>
		(this.coverLetterDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<hrms.hrms.entities.concretes.CoverLetter> getById(int id) {
		return new SuccessDataResult<CoverLetter>
		(this.coverLetterDao.getById(id),"Data listed");
	}
	
	
}
