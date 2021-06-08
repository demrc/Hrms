package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Language;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
public interface LanguageService {

	Result add(Language language);
	Result update(Language language);
	Result delete(int id);
	
	DataResult<List<Language>> getAll();
	DataResult<Language> getById(int id);
	DataResult<List<Language>> getByJobSeekerId(int id);
}
