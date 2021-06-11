package hrms.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.hrms.entities.concretes.JobAdvertisement;
import hrms.hrms.entities.dtos.JobAdvertisementWithTools;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	JobAdvertisement deleteById(int id);
	List<JobAdvertisement> getByActiveTrueAndCompany(String companyname);
	List<JobAdvertisement> getByReleaseDate(Date releaseDate);
	List<JobAdvertisement> getByDeadLine(Date deadline);
	List<JobAdvertisement> getByActiveTrueAndJobName(String name);
	List<JobAdvertisement> getByActiveTrueAndOpenPositions(int open_positions);
	
	@Query("Select new hrms.hrms.entities.dtos.JobAdvertisementWithTools(j.id,c.cityName,j.jobAdName)"
			+ "From City c Inner Join c.job_advertisements j")
	List<JobAdvertisementWithTools> getJobAdDetails();
	
}
