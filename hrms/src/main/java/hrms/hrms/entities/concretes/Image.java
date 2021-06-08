package hrms.hrms.entities.concretes;

import java.util.Map;

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
@Table(name="images")
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="url")
	private Map<String, String> url;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private JobSeeker jobSeeker;

	public Image() {}
	public Image(int id, Map<String, String> url, JobSeeker jobSeeker) {
		super();
		this.id = id;
		this.url = url;
		this.jobSeeker = jobSeeker;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, String> getUrl() {
		return url;
	}
	public void setUrl(Map<String, String> string) {
		this.url = string;
	}
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public void setUrl1(String string) {
		// TODO Auto-generated method stub
		
	}
}
