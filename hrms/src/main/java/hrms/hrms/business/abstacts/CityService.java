package hrms.hrms.business.abstacts;

import java.util.List;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.entities.concretes.City;
public interface CityService {

	DataResult<List<City>> getAll();
	DataResult<City> getById(int id);
	Result add(City city);
}
