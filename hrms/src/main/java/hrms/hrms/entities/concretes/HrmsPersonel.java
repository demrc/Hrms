package hrms.hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="personels")
public class HrmsPersonel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstName",nullable = false)
	private String firstName;
	
	@Column(name="lastName",nullable = false)
	private String lastName;
	
	@Column(name="user_id")
	private int user_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " user_id", referencedColumnName = "id", nullable = false)
	private User users;

	
	public HrmsPersonel() {
		
	}


	public HrmsPersonel(int id, String firstName, String lastName, int user_id, User users) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.user_id = user_id;
		this.users = users;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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
