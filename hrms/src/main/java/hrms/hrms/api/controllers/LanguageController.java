package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.LanguageService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/language")
public class LanguageController {

	private LanguageService languageService;
	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService=languageService;
	}
	@GetMapping("/gelAll")
	public DataResult<List<Language>> getAll() {
		return this.languageService.getAll();
	}
	@GetMapping("/getById")
	public DataResult<Language> getById(@RequestParam("id") int id) {
		return this.languageService.getById(id);
	}
	@GetMapping("/getByJobSeekerId")
	public DataResult<Language> getByJobSeekerId(@RequestParam("id") int id) {
		return this.getByJobSeekerId(id);
	}
	@PostMapping("/update")
	public Result update(@RequestBody Language language) {
		return this.languageService.update(language);
	}
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.delete(id);
	}
	
}
