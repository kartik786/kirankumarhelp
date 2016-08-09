package com.flp.ems.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.flp.ems.domain.Employee;


public class BootClass {
	private static	int choice;
	 Employee emplo=new Employee();
	
	static Scanner Scan=new Scanner(System.in); 
	
	BootClass(int choice)
	{
		this.choice=choice;// CLASS CHOICE AND CONSTRUCTOR CHOICE
	}
	public static UserInteraction u1=new UserInteraction();

	
public static void  menuSelection()

{
	
while(true)
{
int choice;// methods choice
System.out.println("Welcome to Employee management system");
System.out.println("Press 1 To Add a Employee");
System.out.println("Press 2 For Modifying The Employee ");
System.out.println("Press 3 For Removing The Employee ");
System.out.println("Press 4 For Searching the Employee ");
System.out.println("Press 5 For Getting all the employees ");
System.err.println("Press 6 to exit");
System.out.println("Enter your choice");
choice=Scan.nextInt();

BootClass o1=new BootClass( choice);


	switch (choice)
	
	{
	
	
    case 1:System.out.println("you selected to Add a employee");
	 u1.AddEmployee();
	 break;
	 
	  
	        
	        
	case 2:System.out.println("you selected to modify employee");
    u1.ModifyEmployee();
    break;
    
	case 3:System.out.println("you selected to Remove the employee");
    u1.RemoveEmployee();
    break;
    
	case 4:System.out.println("you selected to Search a employee");
    u1.SearchEmployee();
    break;
    
	case 5:System.out.println("you selected to get all employees");
    u1.getAllEmployee();
     break;
     
	case 6 :System.out.println("you selected to exit"); 
		System.exit(0);
	
     default : System.out.println("wrong choice");
     
	}
}}
public static void main(String[] args) {
	menuSelection();
}
}
