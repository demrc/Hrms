package hrms.hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.JobAdvertisementService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.SuccessDataResult;

import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.dataAccess.abstracts.JobAdvertisementDao;
import hrms.hrms.entities.concretes.JobAdvertisement;
import hrms.hrms.entities.dtos.JobAdvertisementWithTools;



@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao=jobAdvertisementDao;
		
	}
	
	@Override
	public DataResult<JobAdvertisement> deleteById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.deleteById(id),"Data deleted.");
		
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.save(null),"Data added.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndCompany(String companyname) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActiveTrueAndCompany(companyname),"Data Listed.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByReleaseDate(Date releaseDate) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByReleaseDate(releaseDate),"Data Listed.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByDeadLine(Date deadline) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByDeadLine(deadline),"Data Listed.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndJobName(String name) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActiveTrueAndJobName(name),"Data Listed.");
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveTrueAndOpenPositions(int open_positions) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByActiveTrueAndOpenPositions(open_positions),"Data Listed.");
		
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize) {

		Pageable pageable= PageRequest.of(pageNo-1, pageSize);
				
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {

		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort),"Successful.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data Listed.");

	}

	@Override
	public DataResult<List<JobAdvertisementWithTools>> getJobDetails() {
		return new SuccessDataResult<List<JobAdvertisementWithTools>>(this.jobAdvertisementDao.getJobAdDetails());
	}

}
