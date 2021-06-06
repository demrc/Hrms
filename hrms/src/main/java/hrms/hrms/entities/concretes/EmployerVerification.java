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

import lombok.Data;

@Entity
@Data
@Table(name="employerVerifications")
public class EmployerVerification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="isPersonelApproved")
	private boolean isPersonelApproved;
	
	@Column(name="personelApprovedDate")
	private Date personelApprovedDate;
	
	@Column(name="isEmailApproved")
	private boolean isEmailApproved;
	
	@Column(name="emailApprovedDate")
	private Date emailApprovedDate;
	
	@Column(name="user_id")
	private int user_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " user_id", referencedColumnName = "id", nullable = false)
	private User users;
	
	public EmployerVerification() {
		
	}

	public EmployerVerification(int id, boolean isPersonelApproved, Date personelApprovedDate, boolean isEmailApproved,
			Date emailApprovedDate, int user_id, User users) {
		super();
		this.id = id;
		this.isPersonelApproved = isPersonelApproved;
		this.personelApprovedDate = personelApprovedDate;
		this.isEmailApproved = isEmailApproved;
		this.emailApprovedDate = emailApprovedDate;
		this.user_id = user_id;
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPersonelApproved() {
		return isPersonelApproved;
	}

	public void setPersonelApproved(boolean isPersonelApproved) {
		this.isPersonelApproved = isPersonelApproved;
	}

	public Date getPersonelApprovedDate() {
		return personelApprovedDate;
	}

	public void setPersonelApprovedDate(Date personelApprovedDate) {
		this.personelApprovedDate = personelApprovedDate;
	}

	public boolean isEmailApproved() {
		return isEmailApproved;
	}

	public void setEmailApproved(boolean isEmailApproved) {
		this.isEmailApproved = isEmailApproved;
	}

	public Date getEmailApprovedDate() {
		return emailApprovedDate;
	}

	public void setEmailApprovedDate(Date emailApprovedDate) {
		this.emailApprovedDate = emailApprovedDate;
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
