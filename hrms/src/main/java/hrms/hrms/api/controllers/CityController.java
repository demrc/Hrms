package hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.business.abstacts.CityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/city")
public class CityController {
	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService=cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return this.cityService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(City city) {
		return this.cityService.add(city);
	}
	
	@GetMapping("/getById")
	public DataResult<City> getById(int id){
		return this.cityService.getById(id);
	}
}
