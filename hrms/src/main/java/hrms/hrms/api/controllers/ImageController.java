package hrms.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.business.abstacts.ImageService;
import hrms.hrms.business.abstacts.JobSeekerService;
import hrms.hrms.entities.concretes.Image;


@RestController
@RequestMapping("/api/image")
public class ImageController {

	private ImageService imageService;

	
	@Autowired
	public ImageController(ImageService imageService, JobSeekerService jobSeekerService) {
		super();
		this.imageService=imageService;
	
	}
	@PostMapping(value = "/add")
	public Result add(@RequestBody Image image,MultipartFile imageFile) {
		return this.imageService.add(image, imageFile);
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody Image image,MultipartFile imageFile) {
		return this.imageService.update(image);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.imageService.delete(id);
	}
	@GetMapping("/gelAll")
	public DataResult<List<Image>> getAll() {
		return this.imageService.getAll();
	}
	@GetMapping("/getById")
	public DataResult<Image> getById(@RequestParam("id") int id) {
		return this.imageService.getById(id);
	}
	@GetMapping("/getByJobSeekerId")
	public DataResult<List<Image>> getByJobSeekerId(@RequestParam("id") int id) {
		return this.getByJobSeekerId(id);
	}
}
	

