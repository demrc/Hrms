package hrms.hrms.business.abstacts;

import java.util.List;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.JobSeeker;
import hrms.hrms.entities.concretes.User;
import hrms.hrms.entities.dtos.JobSeekerWithCvDto;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> findByEmailAndNatiınaolId(String email, String nationalid);
	Result add(JobSeeker jobSeeker,User user);
	Result Login(String email,String password);
	DataResult<List<JobSeeker>>  getAll();
	Result Register(JobSeeker jobSeeker, User user);
	Result getById(int id);
	DataResult<List<JobSeekerWithCvDto>>  getJobSeekerWithCvDetails();

}
