package com.flp.ems.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	
		
	    
		public String Employeeid,Phoneno,choiceofproject,Role;
		public String Name,Emailid,Dateofbirth,DateofJoining,Address,choiceofdepartment,Depar_tm,project,choiceofrole,Departmenid,departmentRandom,projectrandom,projectid,roleid;
		boolean checkdate,checkname,checkemail,checkphoneno;
		
		//kinid
		
		Employee employee=new Employee();
		 
		Department department=new Department();
		
		Scanner Scan=new Scanner(System.in);
		  
		IEmployeeService empl=new EmployeeServiceImpl();
		
		Validate valid=new Validate();
		 
		
		public void AddEmployee()
		{
			HashMap<String, String> hashmap=new HashMap<String,String> ();
		
			do{
			System.out.println("Enter the name of employee");
			Name=Scan.nextLine();
			 checkname=valid.validateName(Name);
			if(checkname==true)
			hashmap.put("Name", Name);
			else
				System.out.println("invalid name");
			}
			while(checkname==false);
		
		
		
			System.out.println("Enter the Employeeid");
			Employeeid=Scan.nextLine();
			hashmap.put("Employeeid", Employeeid);	
		
			do{
			System.out.println("Enter the Emailid");
			Emailid=Scan.nextLine();
			checkemail=valid.validateEmail(Emailid);
			if (checkemail==true)
			hashmap.put("Emailid",Emailid );
			else
				System.out.println("invalid email");
			}
			while(checkemail==false);
			
			
			
			
			do{
				System.out.println("Enter the  DateofBirth");
			
			Dateofbirth=Scan.nextLine();
			checkdate=valid.valid_Date(Dateofbirth);
		    if(checkdate==true)
		    	hashmap.put("Dateofbirth",Dateofbirth );
		    else 
		    	System.out.println("invalid date");
			}
			while (checkdate==false);
			
			System.out.println("Enter the  Adress");
			Address=Scan.nextLine();
			hashmap.put("Address", Address);
			
			do{
			System.out.println("Enter the of DateofJoining");
			DateofJoining=Scan.nextLine();
			checkdate=valid.valid_Date(DateofJoining);
			if(checkdate==true)
			{	hashmap.put("DateofJoining", DateofJoining);
	        
			}
			else
				System.out.println("invalid date enter the date again");
			}while(checkdate==false);
			
			
			
			do{
			
			System.out.println("Enter the phoneno of employee");
			Phoneno=Scan.nextLine();
			checkphoneno=valid.validatephone(Phoneno);
			if(checkphoneno==true)
			hashmap.put("Phoneno", Phoneno);
			else System.out.println("invalid number");	
			}
			while(checkphoneno==false);
			
			
			
			
			Random randomGenerator = new Random();


	        int randomInt =  randomGenerator.nextInt(1000);
	        String kinid=  String.valueOf(randomInt);
	        hashmap.put("kinid", kinid);
			
			
	        int depatmentrandomid=randomGenerator.nextInt(100);
			Departmenid=String.valueOf(depatmentrandomid);
		    hashmap.put("departmentRandom", departmentRandom);	
		   
		    System.out.println("enter department ID");
		    Departmenid=Scan.nextLine();
		    
			hashmap.put("Departmentid", Departmenid);
			
			
			System.out.println("enter project id");
			projectid=Scan.nextLine();
			hashmap.put("projectid", projectid);
			
			int randomprojectid=randomGenerator.nextInt(10);
			projectrandom=String.valueOf(randomprojectid);
			hashmap.put("randomprojectid", projectrandom);
			
			
			
			System.out.println("enter role id");
			roleid=Scan.nextLine();
			hashmap.put("roleid",roleid);
			
			
			System.out.println("choice of differnt department a for adm /t b for cards /t c for mainframes");
			choiceofdepartment=Scan.nextLine();
			
			switch (choiceofdepartment) {
			case "a": System.out.println("Department is ADM");
			Depar_tm="ADM";
			System.out.println("choice of project press 1 for Morgan stanley \t 2 for Braclays \t  3 for hsbc");
			choiceofproject=Scan.nextLine();   
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			
			
			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			}
			break;
			
			case "b":System.out.println("Department is Cards");
			Depar_tm="Cards";
			System.out.println("choice of project press 1 for Morgan stanley \t 2 for Braclays \t  3 for hsbc");
			choiceofproject=Scan.nextLine(); 
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			
			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			
			break;}
			
			break;
			
			case "c":System.out.println("Department is testing");
			Depar_tm="testing";
			System.out.println("choice of project press 1 for Morgan stanley \t 2 for Braclays \t  3 for hsbc");
			choiceofproject=Scan.nextLine(); 
			switch (choiceofproject)
			{
			
			case"1":System.out.println("project is morgan stanley");
			project="morganStanley";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			case"2":System.out.println("project is barclays");
			project="barclays";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			case"3":System.out.println("project is hsbc");
			project="hsbc";
			System.out.println("enter m for Role of software engineer, n for Sr. software engineer, p for consultant");
			choiceofrole=Scan.nextLine();
switch(choiceofrole)
{
case"m": System.out.println("employee is software engineer");
         Role="software engineer";
         break;
case"n": System.out.println("employee is Sr.software engineer");
          Role="Sr. software engineer";
          break;
case"p": System.out.println("employee is consultant");
          Role="Consultant";
           break;  
}

			break;
			}
			break;

			default:System.out.println("wrong choice");
				break;
			}
			  
			hashmap.put("Department", Depar_tm);
			hashmap.put("project", project);
			hashmap.put("Role", Role);
			
	
			empl.AddEmployee( hashmap);
			
	
			}

	public void ModifyEmployee() {
		System.out.println("enter the id of employee which you want to modify");
		Employeeid=Scan.nextLine();
	empl.ModifyEmployee(Employeeid);
	}
	

	public void SearchEmployee() {
		System.out.println("Enter 1 for searching by employeeid only , AND Enter 2 for searching by employeeid and name");
		String choiceofsearch=Scan.nextLine();
		
		
		switch(choiceofsearch)
		{ 
		
		
		case"1":	System.out.println("enter the employee id");
		Employeeid=Scan.nextLine();
	empl.SearchEmployee(Employeeid);
	 
		case"2": System.out.println("Enter id and name");
				Employeeid=Scan.nextLine();
	            Name=Scan.nextLine();
	            empl.SearchEmployee(Employeeid,Name);
		
	}}

	public void RemoveEmployee() {
	System.out.println("enter the employee id of employee which you want to remove");
		Employeeid=Scan.nextLine();
		empl.RemoveEmployee(Employeeid);
	}

	public void getAllEmployee() {
		
		empl.getAllEmployee();
	}

}




