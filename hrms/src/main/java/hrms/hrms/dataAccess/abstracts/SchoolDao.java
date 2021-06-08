package hrms.hrms.dataAccess.abstracts;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School, Integer> {

	School getById(int id);
	List<School> getByDate(Date finishDate);
}
