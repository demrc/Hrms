package hrms.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "job_advertisements"})
public class Employer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="companyname",nullable = false)
	private String companyname;
	
	@Column(name="web_adress",nullable = false)
	private String web_adress;
	
	@Column(name="phonenumber",nullable = false)
	private String phonenumber;
	
	@Column(name="user_id")
	private int user_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " user_id", referencedColumnName = "id", nullable = false)
	private User users;
	
	@OneToMany(mappedBy = "employers")
	private List<JobAdvertisement> jobAdvertisements;

	public Employer() {
		
	}

	public Employer(int id, String companyname, String web_adress, String phonenumber, int user_id, User users,
			List<JobAdvertisement> jobAdvertisements) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.web_adress = web_adress;
		this.phonenumber = phonenumber;
		this.user_id = user_id;
		this.users = users;
		this.jobAdvertisements = jobAdvertisements;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getWeb_adress() {
		return web_adress;
	}

	public void setWeb_adress(String web_adress) {
		this.web_adress = web_adress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}

	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}
	
	
}
