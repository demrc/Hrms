package hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.EmployerVerification;

public interface EmployerVerificationDao extends JpaRepository<EmployerVerificationDao, Integer> {
	EmployerVerification getById(int id);
}
