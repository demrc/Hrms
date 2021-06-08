package hrms.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.business.abstacts.ImageService;
import hrms.hrms.core.utilities.adapters.images.ImageLoadService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.ImageDao;

import hrms.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService {

	private ImageLoadService imageLoadService;
	private ImageDao imageDao;
	@Autowired
	public ImageManager(ImageDao imageDao,ImageLoadService imageLoadService) {
		super();
		this.imageLoadService=imageLoadService;
		this.imageDao=imageDao;
	}
	
	@Override
	public Result add(Image image,MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageLoadService.loadImage(imageFile).getUrl();
		image.setUrl1(uploadImage.get("url"));
		this.imageDao.save(image);
		return new SuccessResult();
	}

	@Override
	public Result update(Image image) {
		this.imageDao.save(image);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.imageDao.delete(null);
		return null;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>
		(this.imageDao.findAll(),"Data listed");
	}

	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>
		(this.imageDao.getById(id),"Data listed");
	}

	@Override
	public DataResult<List<Image>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<Image>>
		(this.imageDao.getByJobSeekerId(id),"Data listed");
	}

	

}
