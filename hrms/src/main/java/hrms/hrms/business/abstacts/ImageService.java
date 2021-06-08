package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Image;

import java.util.List;

import hrms.hrms.core.utilities.results.DataResult;
public interface ImageService {

	Result add(Image image);
	Result update(Image image);
	Result delete(int id);
	
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);
	DataResult<List<Image>> getByJobSeekerId(int id);
}
