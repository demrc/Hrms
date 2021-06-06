package hrms.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.hrms.business.abstacts.HrmsPersonelService;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.HrmsPersonel;

@RestController
@RequestMapping("/api/hrmspersonel")
public class HrmsPersonelController {

	private HrmsPersonelService hrmsPersonelService;
	
	@Autowired
	public HrmsPersonelController(HrmsPersonelService hrmsPersonelService) {
		super();
		this.hrmsPersonelService=hrmsPersonelService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody HrmsPersonel hrmsPersonel) {
		Result result= hrmsPersonelService.confirm(hrmsPersonel);
		if(!result.isSuccess()) {
			return new ErrorResult();
		}
		return new SuccessResult();
	}
		
	}

