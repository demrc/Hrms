package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstacts.AbilityService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;

import hrms.hrms.dataAccess.abstracts.AbilityDao;
import hrms.hrms.entities.concretes.Ability;

@Service
public class AbilityManager implements AbilityService{

	private AbilityDao abilityDao;

	@Autowired
	public AbilityManager(AbilityDao abilityDao) {
		super();
		this.abilityDao=abilityDao;
	}
	
	@Override
	public Result add(Ability ability) {
		this.abilityDao.save(ability);
		return new SuccessResult();
	}

	@Override
	public Result delete(int id) {
		this.abilityDao.delete(null);;
		return null;
	}

	@Override
	public Result update(Ability ability) {
		this.abilityDao.save(ability);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Ability>> getAll() {
		return new SuccessDataResult<List<Ability>>
		(this.abilityDao.findAll(),"Data listelendi");
	}

	@Override
	public DataResult<Ability> getById(int id) {
		return new SuccessDataResult<Ability>
		(this.abilityDao.getById(id),"Data listed");
	}

	@Override
	public DataResult<List<Ability>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<Ability>>
		(this.abilityDao.getByJobSeekerId(id),"Data listed by JobSeeker Id");
	}
	

	
}
