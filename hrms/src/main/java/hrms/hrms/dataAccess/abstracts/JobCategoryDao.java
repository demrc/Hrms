package hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobCategory;


public interface JobCategoryDao extends  JpaRepository<JobCategory,Integer> {

	List<JobCategory> findByName(String name);
}
