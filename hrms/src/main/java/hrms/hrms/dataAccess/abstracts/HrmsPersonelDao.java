package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.HrmsPersonel;

public interface HrmsPersonelDao extends JpaRepository<HrmsPersonel, Integer>{

}
