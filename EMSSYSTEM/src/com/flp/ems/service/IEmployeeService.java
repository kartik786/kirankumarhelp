package com.flp.ems.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public void AddEmployee(HashMap hashmap ) ;
   	public void SearchEmployee(String employeeid) ;
   	public void SearchEmployee(String employeeid,String Name);
	public void RemoveEmployee(String employeeid) ;
	public void getAllEmployee() ;
	public void ModifyEmployee(String Employeeid);
		
}
