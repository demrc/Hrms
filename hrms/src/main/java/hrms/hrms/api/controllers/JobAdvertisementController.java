package hrms.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.JobAdvertisement;
import hrms.hrms.core.utilities.results.Result;

import java.util.Date;
import java.util.List;

import hrms.hrms.business.abstacts.JobAdvertisementService;

@RestController
@RequestMapping("api/jobAdvertisement")
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService=jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<JobAdvertisement>> getAll(int pageNo,int pageSize){
		return this.jobAdvertisementService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<JobAdvertisement>> getAllSorted(){
		return this.jobAdvertisementService.getAllSorted();
	}
	
	@GetMapping("/getByActiveTrueAndCompany")
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndCompany(String companyname){
		return this.jobAdvertisementService.getByActiveTrueAndCompany(companyname);
	}
	
	@GetMapping("/getByReleaseDate")
	public DataResult<List<JobAdvertisement>> getByReleaseDate(Date releaseDate){
		return this.jobAdvertisementService.getByReleaseDate(releaseDate);
	}
	
	@GetMapping("/getByDeadline")
	public DataResult<List<JobAdvertisement>> getByDeadLine(Date deadline)  {
		return this.jobAdvertisementService.getByDeadLine(deadline);
	}
	
	@GetMapping("/getByActiveAndJobName")
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndJobName(String name) {
		return this.jobAdvertisementService.getByActiveTrueAndJobName(name);
	}
	
	@GetMapping("/getByActiveTrueAndOpenPositions")
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndOpenPositions(int open_positions)  {
		return this.getByActiveTrueAndOpenPositions(open_positions);
	}

}
