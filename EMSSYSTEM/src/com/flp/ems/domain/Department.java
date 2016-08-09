package com.flp.ems.domain;

import java.util.Scanner;

public class Department {
String	Departmenid,departmentRandom;
public String getDepartmenid() {
	return Departmenid;
}

public void setDepartmenid(String departmenid) {
	Departmenid = departmenid;
}

public String getDepartmentRandom() {
	return departmentRandom;
}

public void setDepartmentRandom(String departmentRandom) {
	this.departmentRandom = departmentRandom;
}

private String dept;


Scanner scan=new Scanner(System.in);


public void setdepartment(String dept) {
this.dept=dept;
}

public String getdepartment()
{
	return dept;
}

@Override
public String toString() {
	return "Department [Departmenid=" + Departmenid + ", departmentRandom=" + departmentRandom + ", dept=" + dept + "]";
}



}
