package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Project;

public class EmployeeDaoImplForList implements IemployeeDao  {
	ArrayList<Employee> employee1 = new ArrayList<>();
	
	public void AddEmployee(Employee employee,Department department,Project project) {
		
	
		
		employee1.add(employee);
	
	   
	    
		System.out.println("employee added succefully");
	}
	
	public void ModifyEmployee(String Employeeid)
	
	{	 String Employeeidnew,Phonenonew,choiceofprojectnew;
	 String Namenew,Emailidnew,Dateofbirthnew,DateofJoiningnew,Addressnew,Departmentnew,projectnew;
		
		
		Iterator itr=employee1.iterator();
	while(itr.hasNext())
	{
		
		Employee employee=(Employee) itr.next();
	
	if(employee.getEmployeeid().equals(Employeeid))
		
	{
		
	System.out.println("Enter the trait which you want to modify");
	System.out.println("press 1 for name");
	System.out.println("press 2 for phonenumber");
	System.out.println("press 3 for employeeid");
	System.out.println("press 4 for emailid");
	System.out.println("press 5 for date of joining");
	
	
	Scanner s= new Scanner(System.in);
	String choiceofmodify=s.nextLine(); 
		switch(choiceofmodify){
		case "1":System.out.println("enter the new name");
		Namenew=s.nextLine();
		employee.SetName(Namenew);
		break;
		
		
		case "2":System.out.println("enter the new phonenumber");
		Phonenonew=s.nextLine();
		employee.SetPhoneno(Phonenonew);
		break;
		
		case "3":System.out.println("enter the new emailid");
		Emailidnew=s.nextLine();
		employee.SetEmailid(Emailidnew);
		break;
		
		
		
		case "4":System.out.println("enter the new date of birth");
		Dateofbirthnew=s.nextLine();
		employee.SetDateofbirth(Dateofbirthnew);
		break;
		
		case "5":System.out.println("enter the new dateofjoining");
		DateofJoiningnew=s.nextLine();
		employee.SetDateofJoining(DateofJoiningnew);
		 break;
		
		}}}}

		 
		 
		
		 
		 
		
		
		
		
		

	
	
	
	
	
	public void SearchEmployee(String Employeeid) 
	{
		for(Employee employee:employee1) 	{
			
			if(employee.getEmployeeid().equals(Employeeid))
			{System.out.println("Emploeeid found ");
			System.out.println(employee);
			}
	}
	 
 
	}
		
	public void SearchEmployee(String employeeid, String name)
	{
		for(Employee employee:employee1)
		{
			if((employee.getEmployeeid().equals(employeeid)) && ( employee.getName().equals(name)))
			System.out.println(employee);
			
		}
	}
	
	
	
	
	
	public void RemoveEmployee(String Employeeid ) 
	{
		Iterator<Employee> itr = employee1.iterator();
		while(itr.hasNext())
		{Employee employee=(Employee) itr.next();
			if(employee.getEmployeeid().equals(Employeeid))
				itr.remove();
			else
			continue;
		}
		
	}
	
	
	
	
	public void getAllEmployee() {
		Iterator itr = employee1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
