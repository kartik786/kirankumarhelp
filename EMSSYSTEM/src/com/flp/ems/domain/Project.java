package com.flp.ems.domain;

public class Project {

	String project,randomproject,projectid;
public String getRandomproject() {
		return randomproject;
	}
	public void setRandomproject(String randomproject) {
		this.randomproject = randomproject;
	}
	public String getProjectid() {
		return projectid;
	}
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
public void	setproject(String project )
{ 
	
	this.project=project;
	
	}
public String getproject()
{
return project;	}
@Override
public String toString() {
	return "Project [randomproject=" + randomproject + ", projectid=" + projectid + "]";
}
}
