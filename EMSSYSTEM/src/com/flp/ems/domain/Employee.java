package com.flp.ems.domain;
import java.util.Date;
import com.flp.ems.domain.*;

public class Employee {
	private String Employeeid,Phoneno;
	private String Name,Kinid,Emailid,Dateofbirth,DateofJoining,Address;
	public Department department;
	public Project project;
	public Role role;
	
	
	
	


	public void SetName(String Name)
	{
		this.Name=Name;
	}
	
	public String getName() {
		return Name;
	}
	
	
	public void SetEmployeeid(String Employeeid)
	{
		this.Employeeid=Employeeid;
	}
	
	public  String getEmployeeid() {
		return Employeeid;
	}
	

	
	public void SetEmailid(String Emailid)
	{
		this.Emailid=Emailid;
	}
	
	public String getEmailid() {
		return Emailid;
	}
	

	public void SetDateofbirth(String Dateofbirth)
	{
		this.Dateofbirth=Dateofbirth;
		
	}
	public String getDateofbirth() {
		return Dateofbirth;
	}
	
	public void SetAddress(String Address)
	{
		this.Address=Address;
	}
	
	public String getAdress() {
		return Address;
	}
	

	public void SetPhoneno(String Phoneno)
	{
		this.Phoneno=Phoneno;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void SetDateofJoining(String DateofJoining) {
		this.DateofJoining=DateofJoining;
		
		
	}
	public String getDateofJoining() {
		
		return DateofJoining;
	}
	
	
	
	public void setDepartment(Department department) {
		this.department=department;
		
	}
	
	public Department getDepartment()
	{
		return department;
		
	}
	
	
	
	public void setProject(Project project) {
	
		this.project=project;
		
	}
	
	public Project getProject()
	{
		return project;
		
	}
	
	
	public Role getRole(Role role) {
		return role;
	}

	public String getKinId() {
		return Kinid;
	}

	public void setKinId(String kinid) {
		this.Kinid = kinid;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	

	@Override
	public String toString() {
		return "Employee [Employeeid=" + Employeeid + ", Phoneno=" + Phoneno + ", Name=" + Name + ", KinId=" + Kinid
				+ ", Emailid=" + Emailid + ", Dateofbirth=" + Dateofbirth + ", DateofJoining=" + DateofJoining
				+ ", Address=" + Address + ", department=" + department + ", project=" + project
				+ ", role=" + role + "]";
	}


	
		
	}
	


	
	

