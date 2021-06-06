package hrms.hrms.business.abstacts;



import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.HrmsPersonel;

public interface HrmsPersonelService {
	
	DataResult<HrmsPersonel> confirm(HrmsPersonel hrmsPersonel);
}
