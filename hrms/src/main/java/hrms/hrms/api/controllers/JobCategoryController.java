package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.JobCategoryService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.JobCategory;

@RestController
@RequestMapping("/api/jobs")
public class JobCategoryController {

	private JobCategoryService jobService;

	@Autowired
	public JobCategoryController(JobCategoryService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobCategory>> getAll(){
		return this.jobService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobCategory jobCategory) {
	Result result = jobService.add(jobCategory);
	if(!result.isSuccess()) {
		return new ErrorResult();
	}
	return new SuccessResult();
}
}

