package hrms.hrms.api.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.ExperienceService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

	private ExperienceService experienceService;
	@Autowired
	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService=experienceService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Experience>> getAll() {
		return this.experienceService.getAll();
	}
	@GetMapping("/getById")
	public DataResult<Experience> getById(@RequestParam("id") int id) {
		return this.experienceService.getById(id);
	}
	@GetMapping("/getByDate")
	public DataResult<List<Experience>> getByDate(Date finishDate) {
		return this.getByDate(finishDate);
	}
	
	@GetMapping("/getByJobSeekerId")
	public DataResult<List<Experience>> getByJobSeekerId(@RequestParam("id") int id) {
		return this.experienceService.getByJobSeekerId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience) {
		return this.experienceService.add(experience);
	}
	@PostMapping("/update")
	public Result update(@RequestBody Experience experience) {
		return this.experienceService.update(experience);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.experienceService.delete(id);
	}
	
	
}
