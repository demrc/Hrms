package hrms.hrms.entities.concretes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email",nullable = false)
	private String email;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Column(name="user_type",nullable = false)
	private int user_type;
	
	@Column(name="is_verification")
	private boolean is_verification;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	private Set<Employer> employers = new HashSet<>();
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	private Set<JobSeeker> jobSeekers = new HashSet<>();
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	private Set<HrmsPersonel> personels = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	private Set<EmployerVerification> employerVerifications = new HashSet<>();

	public User() {

	}


	public User(int id, String email, String password, int user_type, boolean is_verification, Set<Employer> employers,
			Set<JobSeeker> jobSeekers, Set<HrmsPersonel> personels,Set<EmployerVerification> employerVerifications) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.user_type = user_type;
		this.is_verification = is_verification;
		this.employers = employers;
		this.jobSeekers = jobSeekers;
		this.personels = personels;
		this.employerVerifications=employerVerifications;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getUser_type() {
		return user_type;
	}


	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}


	public boolean isIs_verification() {
		return is_verification;
	}


	public void setIs_verification(boolean is_verification) {
		this.is_verification = is_verification;
	}


	public Set<Employer> getEmployers() {
		return employers;
	}


	public void setEmployers(Set<Employer> employers) {
		this.employers = employers;
	}


	public Set<JobSeeker> getJobSeekers() {
		return jobSeekers;
	}


	public void setJobSeekers(Set<JobSeeker> jobSeekers) {
		this.jobSeekers = jobSeekers;
	}


	public Set<HrmsPersonel> getPersonels() {
		return personels;
	}


	public void setPersonels(Set<HrmsPersonel> personels) {
		this.personels = personels;
	}


	public Set<EmployerVerification> getEmployerVerifications() {
		return employerVerifications;
	}


	public void setEmployerVerifications(Set<EmployerVerification> employerVerifications) {
		this.employerVerifications = employerVerifications;
	}


	
}
