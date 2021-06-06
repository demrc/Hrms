package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.UserService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.User;

@RestController
@RequestMapping("api/user")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService=userService;
	}
	
	@GetMapping("/getall")
	public  DataResult<List<User>> getAll(){
		return this.userService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		Result result = userService.add(user);
		if(!result.isSuccess()) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
	
}
