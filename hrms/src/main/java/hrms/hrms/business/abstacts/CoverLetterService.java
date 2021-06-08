package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CoverLetter;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;

public interface CoverLetterService {

	Result add(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(int id);
	
	DataResult<List<CoverLetter>> getAll();
	DataResult<CoverLetter> getById(int id);
}
