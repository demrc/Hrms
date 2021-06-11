package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hrms.hrms.entities.concretes.JobSeeker;
import hrms.hrms.entities.dtos.JobSeekerWithCvDto;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	List<JobSeeker> findByEmailAndNatiınaolId(String email, String nationalid);
	
	@Query("Select new hrms.hrms.entities.dtos"
			+ "(a.abilityName,s.schoolName,c.coverLetter,e.experienceDate,l.languageName,p.personalLinkName) "
			+ "From Ability a Inner Join a.jobSeeker j,Experience e Inner Join e.jobSeeker j,"
			+ "School s Inner Join s.jobSeeker j, CoverLetter c Inner Join c.jobSeeker j,"
			+ "Language l Inner Join l.jobSeeker j, PersonalLinks p Inner Join p.jobSeeker j")
	List<JobSeekerWithCvDto> getJobSeekerWithCvDetails();
}
