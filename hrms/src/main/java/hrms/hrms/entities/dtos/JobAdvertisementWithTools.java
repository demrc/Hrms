package hrms.hrms.entities.dtos;

public class JobAdvertisementWithTools {
	private int id;
	private String cityName;
	private String jobAdName;
	
	public JobAdvertisementWithTools() {}

	public JobAdvertisementWithTools(int id, String cityName, String jobAdName) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.jobAdName = jobAdName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getJobAdName() {
		return jobAdName;
	}

	public void setJobAdName(String jobAdName) {
		this.jobAdName = jobAdName;
	}

}
