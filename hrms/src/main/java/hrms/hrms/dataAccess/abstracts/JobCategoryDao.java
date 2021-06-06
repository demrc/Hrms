package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.JobCategory;


public interface JobCategoryDao extends  JpaRepository<JobCategory,Integer> {

}
