package org.chucks.project.employer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="EMPLOYEE_DET")
public class Employee {
	
	@Id
	//@Column(name="EMP_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long empId;
	//@Column(name="EMP_NAME")
	private String empName;
	//@Column(name="EMP_DESIG")
	private String designation;
	
	
	
	public Employee(long empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	public Employee() {
		
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
