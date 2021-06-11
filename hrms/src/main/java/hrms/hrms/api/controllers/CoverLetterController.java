package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.CoverLetterService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverLetter")
public class CoverLetterController {
	private CoverLetterService coverLetterService;
	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService=coverLetterService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CoverLetter>> getAll() {
		return this.coverLetterService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<CoverLetter> getById(int id) {
		return this.coverLetterService.getById(id);
	}
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
		}

	@PostMapping("/update")
	public Result update(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.update(coverLetter);
		}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.coverLetterService.delete(id);
		}
	
	
	
}
