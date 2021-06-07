package hrms.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import hrms.hrms.business.abstacts.EmployerVerificationService;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.EmployerVerification;

@RestController
@RequestMapping("/api/employerVerification")
public class EmployerVerificationController {

	private EmployerVerificationService employerVerificationService;
	
	@Autowired
	public EmployerVerificationController(EmployerVerificationService employerVerificationService) {
		super();
		this.employerVerificationService=employerVerificationService;
	}
	
	
	@PostMapping("/add")
	public Result add(EmployerVerification employerVerification) {
		return this.employerVerificationService.add(employerVerification);
	}
}
