package hrms.hrms.dataAccess.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
	Experience getById(int id);
	List<Experience> getByDate(Date finishDate);
	List<Experience> getByJobSeekerId(int id);
}
