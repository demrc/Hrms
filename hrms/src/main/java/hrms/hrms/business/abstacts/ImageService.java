package hrms.hrms.business.abstacts;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilities.results.DataResult;
public interface ImageService {

	
	Result update(Image image);
	Result delete(int id);
	
	DataResult<List<Image>> getAll();
	DataResult<Image> getById(int id);
	DataResult<List<Image>> getByJobSeekerId(int id);
	Result add(Image image, MultipartFile imageFile);
}
