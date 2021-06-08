package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.PersonalLinks;

public interface PersonalLinksDao extends JpaRepository<PersonalLinks, Integer>{

	PersonalLinks getById(int id);
	List<PersonalLinks> getByJobSeekerId(int id);
}
