package hrms.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
@Table(name="job_seekers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","users"})//dediğimiz kadarını yap detayına inme diyoruz

public class JobSeeker {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname",nullable = false)
	private String firstname;
	
	@Column(name="lastname",nullable = false)
	private String lastname;
	
	@Column(name="nationalid",nullable = false)
	private String nationalid;
	
	@Column(name="dateofbirth",nullable = false)
	private Date dateofbirth;
	
	@Column(name="user_id")
	private int user_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " user_id", referencedColumnName = "id", nullable = false)
	private User users;

	
	public JobSeeker() {
		
	}


	public JobSeeker(int id, String firstname, String lastname, String nationalid, Date dateofbirth, int user_id,
			User users) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalid = nationalid;
		this.dateofbirth = dateofbirth;
		this.user_id = user_id;
		this.users = users;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getNationalid() {
		return nationalid;
	}


	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}


	public Date getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
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

	

}
