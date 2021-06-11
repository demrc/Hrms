package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.business.abstacts.AbilityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.Ability;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {

	private AbilityService abilityService;
	
	@Autowired
	public AbilityController(AbilityService abilityService) {
		super();
		this.abilityService=abilityService;
		}
	
	@GetMapping("/getall")
	public DataResult<List<Ability>> getAll() {
		return this.abilityService.getAll();
		}
	@GetMapping("/getById")
	public DataResult<Ability> getById(int id) {
		return this.abilityService.getById(id);
		}
	@GetMapping("/getByJobSeekerId")
	public DataResult<List<Ability>> getByJobSeekerId(int id) {
		return this.abilityService.getByJobSeekerId(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Ability ability) {
		return this.abilityService.add(ability);
	}
	@PostMapping("/update")
	public Result update(@RequestBody Ability ability) {
		return this.abilityService.update(ability);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id) {
		return this.abilityService.delete(id);
	}
	
	
	
	
	
}
