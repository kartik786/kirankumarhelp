package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;

public interface IemployeeDao {
public void AddEmployee(Employee employee, Department department, Project project) ;
public void SearchEmployee(String Employeeid) ;
public void RemoveEmployee(String Employeeid) ;
public void getAllEmployee() ;
public void ModifyEmployee(String emplyoeeid);
public void SearchEmployee(String employeeid, String name);

}
