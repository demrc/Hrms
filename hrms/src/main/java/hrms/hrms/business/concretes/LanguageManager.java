package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.business.abstacts.LanguageService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.LanguageDao;
import hrms.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageService languageService) {
		super();
		this.languageDao=languageDao;
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult();
		
	}

	@Override
	public Result update(Language language) {
		this.languageDao.save(language);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.languageDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>
		(this.languageDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>
		(this.languageDao.getById(id),"Data Listed");
	}

	@Override
	public DataResult<List<Language>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<Language>>
		(this.languageDao.getByJobSeekerId(id),"Data listed");
	}
	

}
