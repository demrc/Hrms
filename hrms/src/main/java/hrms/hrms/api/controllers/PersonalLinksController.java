package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.PersonalLinksService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.PersonalLinks;

@RestController
@RequestMapping("/api/personallinks")
public class PersonalLinksController {

	private PersonalLinksService personalLinksService;
	@Autowired
	public PersonalLinksController(PersonalLinksService personalLinksService) {
		super();
		this.personalLinksService=personalLinksService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<PersonalLinks>> getAll() {
		return this.personalLinksService.getAll();
	}
	@GetMapping("/getById")
	public DataResult<PersonalLinks> getById(@RequestParam("id") int id) {
		return this.personalLinksService.getById(id);
	}
	@GetMapping("/getByJobSeekerId")
	public DataResult<List<PersonalLinks>> getByJobSeekerId(@RequestParam("id") int id) {
		return this.personalLinksService.getByJobSeekerId(id);
	}
	@PostMapping("/add")
	public Result add(@RequestBody PersonalLinks personalLinks) {
		return this.add(personalLinks);
	}
	@PostMapping("/update")
	public Result update(@RequestBody PersonalLinks personalLinks) {
		return this.update(personalLinks);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.personalLinksService.delete(id);
	}
}
