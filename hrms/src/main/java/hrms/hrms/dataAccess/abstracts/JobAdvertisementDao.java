package hrms.hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	JobAdvertisement deleteById(int id);
	List<JobAdvertisement> getByActiveTrueAndCompany(String companyname);
	List<JobAdvertisement> getByReleaseDate(Date releaseDate);
	List<JobAdvertisement> getByDeadLine(Date deadline);
	List<JobAdvertisement> getByActiveTrueAndJobName(String name);
	List<JobAdvertisement> getByActiveTrueAndOpenPositions(int open_positions);
	
}
