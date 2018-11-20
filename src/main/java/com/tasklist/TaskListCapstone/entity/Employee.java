package com.tasklist.TaskListCapstone.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@JoinColumn(name = "taskid")
	private Integer empid;
	
	private String empname;
	private String emprole;
	private String empemail;
	private String emppw;
	@OneToMany(mappedBy = "employee")
	private List<Task> tasksList = new ArrayList<>();
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Integer empid, String emppw) {
		super();
		this.empid = empid;
		this.emppw = emppw;
	}


	public Employee(Integer empid, String empname, String emprole, String empemail, String emppw) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
		this.empemail = empemail;
		this.emppw = emppw;
	}

	public Employee(String empname, String emprole, String empemail, String emppw) {
		super();
		this.empname = empname;
		this.emprole = emprole;
		this.empemail = empemail;
		this.emppw = emppw;
	}
	
	public Employee(String empname, String emprole, String empemail) {
		super();
		this.empname = empname;
		this.emprole = emprole;
		this.empemail = empemail;
	}
	
	public Employee(String empname, String emprole, Task taskList) {
		super();
		this.empname = empname;
		this.emprole = emprole;
	}
	
	public Employee(Integer empid, String empname, String emprole, Task taskList) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
	}
	
	public Employee(Integer empid, String empname, String emprole, String empemail, Task taskList) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emprole = emprole;
		this.empemail = empemail;
	}
	
	public Employee(String empname, String emprole, String empemail, Task taskList) {
		super();
		this.empname = empname;
		this.emprole = emprole;
		this.empemail = empemail;
	}


	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public String getEmprole() {
		return emprole;
	}


	public void setEmprole(String emprole) {
		this.emprole = emprole;
	}


	public List<Task> getTasksList() {
		return tasksList;
	}


	public void setTasksList(List<Task> tasksList) {
		this.tasksList = tasksList;
	}
	


	public String getEmpemail() {
		return empemail;
	}


	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}

	

	public String getEmppw() {
		return emppw;
	}


	public void setEmppw(String emppw) {
		this.emppw = emppw;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", emprole=" + emprole;
				
	}
	
	
	
}
