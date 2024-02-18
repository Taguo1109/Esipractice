package tw.taguo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;



@Entity
@Table(name = "employees")
public class Employees {
	
	@Id
	@Column(name = "EmployeeID")
	private int id;
	
	@Column(name ="LastName")
	private String lastname;
	
	@Column(name ="FirstName")
	private String firstname;
	
	@Column(name ="ReportsTo")
	private Integer reportsto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Integer getReportsto() {
		return reportsto != null ? reportsto : 0;
	}

	public void setReportsto(Integer reportsto) {
		this.reportsto = reportsto;
	} 

}
