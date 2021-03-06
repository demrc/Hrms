package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.EmployerService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.Employer;
import hrms.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result result(@RequestBody Employer employer,User user) {
		Result result = employerService.add(employer,user);
		if(!result.isSuccess()) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
	
	@GetMapping("/Login")
	public Result Login(String email, String password) {
		return this.Login(email, password);
	}
	@GetMapping("/Register")
	public Result Register(Employer employer, User user) {
		return this.Register(employer, user);
	}
}
