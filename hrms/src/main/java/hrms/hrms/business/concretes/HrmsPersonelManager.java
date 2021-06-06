package hrms.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.HrmsPersonelService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.dataAccess.abstracts.HrmsPersonelDao;
import hrms.hrms.entities.concretes.HrmsPersonel;
@Service
public class HrmsPersonelManager implements HrmsPersonelService {

	private HrmsPersonelDao hrmsPersonelDao;
	
	@Autowired
	public HrmsPersonelDao hrmsPersonelDao() {
		return hrmsPersonelDao;
	}

	@Override
	public DataResult<HrmsPersonel> confirm(HrmsPersonel hrmsPersonel) {
		this.hrmsPersonelDao.save(hrmsPersonel);
		return new SuccessDataResult<HrmsPersonel>("Approved.");
	}
	
	
}
