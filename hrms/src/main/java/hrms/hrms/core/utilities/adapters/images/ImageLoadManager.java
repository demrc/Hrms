package hrms.hrms.core.utilities.adapters.images;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.utils.ObjectUtils;
import com.cloudinary.Cloudinary;

import hrms.hrms.entities.concretes.Image;

@Service
public class ImageLoadManager implements ImageLoadService {

	private Cloudinary cloudinary;
	
	public ImageLoadManager() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dayx2sam5",
				"api_key", "699443261618643",
				"api_secret", "LaC_8aO4_p-vseLXfpOJGuC-sjI"));
	}
	
	

		@Override
		public Image loadImage(MultipartFile imageFile) {
			try {
				@SuppressWarnings("unchecked")
				Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
				System.out.println("successful");
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
			return null;
		
	}

}
