package hrms.hrms.core.utilities.adapters.images;

import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.entities.concretes.Image;

public interface ImageLoadService {

	Image loadImage(MultipartFile multipartFile);
}
