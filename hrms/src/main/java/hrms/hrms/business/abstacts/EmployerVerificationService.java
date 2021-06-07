package hrms.hrms.business.abstacts;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.entities.concretes.EmployerVerification;
public interface EmployerVerificationService {

	Result add(EmployerVerification employerVerification);
}
