package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.JobSeekerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.JobSeeker;
import hrms.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/JobSeekers")
public class JobSeekerController {

	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobSeeker jobSeeker,User user) {
		Result result = jobSeekerService.add(jobSeeker,user);
		if(!result.isSuccess()) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
	
	@GetMapping("/getByEmailAndNationalId")
	public DataResult<List<JobSeeker>> findByEmailAndNatiınaolId(String email, String nationalid){
		return this.jobSeekerService.findByEmailAndNatiınaolId(email, nationalid);
	}
	
	@GetMapping("/login")
	public  Result Login(String email,String password) {
		return this.jobSeekerService.Login(email, password);
	}
	@GetMapping("/register")
	public Result Register(JobSeeker jobSeeker, User user) {
		return this.jobSeekerService.Register(jobSeeker, user);
	}
}
