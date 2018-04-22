package hrapplication.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ApplicantBean")
public class ApplicantBean implements Serializable{
	
	 private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="applicantId")
	private int applicantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="thoughtsOnJob")
	private String thoughtsOnJob;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="application",
	joinColumns={ @JoinColumn(name="applicantId")},
	inverseJoinColumns={ @JoinColumn(name="hrApplicationId")
	})
	private List<HrApplicationBean> hrApplicationBeans = new ArrayList<HrApplicationBean>();
	
	public List<HrApplicationBean> getHrApplicationBeans() {
		return hrApplicationBeans;
	}


	public void setHrApplicationBeans(List<HrApplicationBean> hrApplicationBeans) {
		this.hrApplicationBeans = hrApplicationBeans;
	}
	


	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getThoughtsOnJob() {
		return thoughtsOnJob;
	}

	public void setThoughtsOnJob(String thoughtsOnJob) {
		this.thoughtsOnJob = thoughtsOnJob;
	}

	public ApplicantBean(String name, String email, String phone, String address, String thoughtsOnJob,
			List<HrApplicationBean> hrApplicationBeans) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.thoughtsOnJob = thoughtsOnJob;
		this.hrApplicationBeans = hrApplicationBeans;
	}

	public ApplicantBean() {
		super();
	}

	
}
