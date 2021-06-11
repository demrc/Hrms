package hrms.hrms.entities.dtos;

import java.sql.Date;

public class JobSeekerWithCvDto {

	private int id;
	private String abilityName;
	private String languageName;
	private String schoolName;
	private String personalLinkName;
	private String coverLetter;
	private Date experienceDate;
	
	public JobSeekerWithCvDto() {}
	
	public JobSeekerWithCvDto(int id, String abilityName, String languageName, String schoolName, String personalLinkName,
			String coverLetter, Date experienceDate) {
		super();
		this.id = id;
		this.abilityName = abilityName;
		this.languageName = languageName;
		this.schoolName = schoolName;
		this.personalLinkName = personalLinkName;
		this.coverLetter = coverLetter;
		this.experienceDate = experienceDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getPersonalLinkName() {
		return personalLinkName;
	}

	public void setPersonalLinkName(String personalLinkName) {
		this.personalLinkName = personalLinkName;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public Date getExperienceDate() {
		return experienceDate;
	}

	public void setExperienceDate(Date experienceDate) {
		this.experienceDate = experienceDate;
	}
}
