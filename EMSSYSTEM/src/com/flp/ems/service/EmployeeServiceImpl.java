package com.flp.ems.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;
import com.flp.ems.domain.Role;


public class EmployeeServiceImpl implements IEmployeeService {
	IemployeeDao empdao=new EmployeeDaoImplForList();
	public void AddEmployee(HashMap hashmap ) {
		Employee employee=new Employee();
		Department department= new Department();
		Project project=new Project();
		Role role=new Role();
		
		
		// retriving data from hashmap and putting into employee
		
		employee.SetEmployeeid((String) hashmap.get("Employeeid"));
		employee.SetAddress((String) hashmap.get("Address"));
		employee.SetDateofbirth((String)hashmap.get("Dateofbirth"));
		employee.SetDateofJoining((String) hashmap.get("DateofJoining"));
		employee.SetName((String) hashmap.get("Name"));
		employee.SetEmailid((String) hashmap.get("Emailid"));
		employee.SetPhoneno((String) hashmap.get("Phoneno"));
       employee.setKinId((String) hashmap.get("kinid"));
		
		
       
       project.setRandomproject((String) hashmap.get("randomprojectid"));
       project.setProjectid((String) hashmap.get("projectid"));
		project.setproject((String) hashmap.get("project"));
        employee.setProject(project);
		
		
		
    	
		department.setDepartmentRandom((String) hashmap.get("departmentRandom"));
        department.setDepartmenid((String) hashmap.get("Departmenid"));
		department.setdepartment((String) hashmap.get("Department"));
		employee.setDepartment(department);
	
		
	
		role.setRoleid((String) hashmap.get("roleid"));
		role.setRole((String) hashmap.get("Role"));
		employee.setRole(role);
		
		
        empdao.AddEmployee(employee,department,project);// passing to dao.
        
	}

public void ModifyEmployee(String Emplyoeeid) {
	empdao.ModifyEmployee(Emplyoeeid);
	
}

public void SearchEmployee(String Employeeid) {
	
	empdao.SearchEmployee(Employeeid);

	
}

public void SearchEmployee(String Employeeid,String Name)
{ empdao.SearchEmployee(Employeeid,Name);
	}

public void RemoveEmployee(String Employeeid) {
	empdao.RemoveEmployee(Employeeid);

	
}

public void getAllEmployee() {
	
	empdao.getAllEmployee();
}}





