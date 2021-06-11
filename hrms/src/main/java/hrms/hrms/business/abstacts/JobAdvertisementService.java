package hrms.hrms.business.abstacts;

import java.util.Date;
import java.util.List;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;

import hrms.hrms.entities.concretes.JobAdvertisement;
import hrms.hrms.entities.dtos.JobAdvertisementWithTools;


public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>>  getAll();
	DataResult<List<JobAdvertisement>>  getAll(int pageNo,int pageSize);
	
	DataResult<List<JobAdvertisement>>  getAllSorted();

	DataResult<JobAdvertisement> deleteById(int id);
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByActiveTrueAndCompany(String companyname);
	DataResult<List<JobAdvertisement>> getByReleaseDate(Date releaseDate);
	DataResult<List<JobAdvertisement>> getByDeadLine(Date deadline);
	DataResult<List<JobAdvertisement>> getByActiveTrueAndJobName(String name);
	DataResult<List<JobAdvertisement>> getByActiveTrueAndOpenPositions(int open_positions);
	DataResult<List<JobAdvertisementWithTools>> getJobDetails();
	
}
