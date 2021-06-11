package hrms.hrms.api.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.SchoolService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/school")
public class SchoolController {
	private SchoolService schoolService;
	@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService=schoolService;
	}
	@GetMapping("/getAll")
	public DataResult<List<School>> getAll() {
		return this.schoolService.getAll();
	}
	@GetMapping("/getById")
	public DataResult<School> getById(@RequestParam("id") int id) {
		return this.schoolService.getById(id);
	}
	@GetMapping("/getByDate")
	public DataResult<List<School>> getByDate(@RequestParam("finishDate") Date finishDate) {
		return this.schoolService.getByDate(finishDate);
	}
}
