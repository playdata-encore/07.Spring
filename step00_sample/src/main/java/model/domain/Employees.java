package model.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employees")
public class Employees {
	@Id
	@Column(name = "employee_id")
	private BigDecimal employeeId;

	@Column(name = "first_name")
	private String firstNam;

	@Column(name = "last_name")
	private String lastName;

	@Column
	private String email;

	@Column(name = "phone_Number")
	private String phoneNumber;

	@Column(name = "hire_Date")
	private Timestamp hireDate;

	@Column(name = "job_Id")
	private String jobId;

	@Column
	private BigDecimal salary;

	@Column(name = "comission_Pct")
	private BigDecimal comissionPct;

	@Column(name = "manager_Id")
	private BigDecimal managerId;

	@Column(name = "department_Id")
	private BigDecimal departmentId;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"");
	
		builder.append("employeeId");
		builder.append("\" : \"");
		builder.append(employeeId);
		builder.append("\", \"");

		builder.append("firstName");
		builder.append("\" : \"");
		builder.append(firstNam);
		builder.append("\", \"");

		builder.append("lastName");
		builder.append("\" : \"");
		builder.append(lastName);
		builder.append("\", \"");

		builder.append("email");
		builder.append("\" : \"");
		builder.append(email);
		builder.append("\", \"");

		builder.append("phoneNumber");
		builder.append("\" : \"");
		builder.append(phoneNumber);
		builder.append("\", \"");

		builder.append("hireDate");
		builder.append("\" : \"");
		builder.append(hireDate);
		builder.append("\", \"");

		builder.append("jobId");
		builder.append("\" : \"");
		builder.append(jobId);
		builder.append("\", \"");

		builder.append("salary");
		builder.append("\" : \"");
		builder.append(salary);
		builder.append("\", \"");

		builder.append("comissionPct");
		builder.append("\" : \"");
		builder.append(comissionPct);
		builder.append("\", \"");

		builder.append("managerId");
		builder.append("\" : \"");
		builder.append(managerId);
		builder.append("\", \"");

		builder.append("departmentId");
		builder.append("\" : \"");
		builder.append(departmentId);
		builder.append("\"");

		builder.append("}");
		return builder.toString();
	}
}
