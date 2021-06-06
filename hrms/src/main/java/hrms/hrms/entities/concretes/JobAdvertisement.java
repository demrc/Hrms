package hrms.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="detail",nullable = false)
	private String detail;
	
	@Column(name="city_id",nullable = false)
	private int city_id;
	
	@Column(name="min_salary")
	private String min_salary;
	
	@Column(name="max_salary")
	private String max_salary;
	
	@Column(name="open_positions",nullable = false)
	private int open_positions;
	
	@Column(name="deadline",nullable = false)
	private Date deadline;
	
	@Column(name="releaseDate",nullable = false)
	private Date releaseDate;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne()
	@JoinColumn(name = "id")
	private JobCategory jobCategory;
	
	@ManyToOne()
	@JoinColumn(name = "id")
	private Employer employers;
	
	@ManyToOne()
	@JoinColumn(name = "id")
	private City cities;
	
	public JobAdvertisement() {
		
	}

	public JobAdvertisement(int id, String name, String detail, int city_id, String min_salary, String max_salary,
			int open_positions, Date deadline, Date releaseDate, boolean status, JobCategory jobCategory,
			Employer employers, City cities) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.city_id = city_id;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
		this.open_positions = open_positions;
		this.deadline = deadline;
		this.releaseDate = releaseDate;
		this.status = status;
		this.jobCategory = jobCategory;
		this.employers = employers;
		this.cities = cities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public String getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(String min_salary) {
		this.min_salary = min_salary;
	}

	public String getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(String max_salary) {
		this.max_salary = max_salary;
	}

	public int getOpen_positions() {
		return open_positions;
	}

	public void setOpen_positions(int open_positions) {
		this.open_positions = open_positions;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public JobCategory getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(JobCategory jobCategory) {
		this.jobCategory = jobCategory;
	}

	public Employer getEmployers() {
		return employers;
	}

	public void setEmployers(Employer employers) {
		this.employers = employers;
	}

	public City getCities() {
		return cities;
	}

	public void setCities(City cities) {
		this.cities = cities;
	}

	
	

}
