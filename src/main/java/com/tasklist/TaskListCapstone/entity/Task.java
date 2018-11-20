package com.tasklist.TaskListCapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskid;
	private String taskname;
	private String taskdescription;
	private String taskdeadline;
	@Column(name="taskowner")
	private Integer empid;
	
	@ManyToOne
	@JoinColumn(name = "empid", insertable=false, updatable=false)
	private Employee employee;
	private String taskcomplete;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Task(Integer taskid, String taskname, String taskdescription, String taskdeadline, Employee employee,
			String taskcomplete) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskdeadline = taskdeadline;
		this.employee = employee;
		this.taskcomplete = taskcomplete;
	}
	
	
	public Task(String taskname, String taskdescription, String taskdeadline, Employee employee,
			String taskcomplete) {
		super();
		this.taskname = taskname;
		this.taskdescription = taskdescription;
		this.taskdeadline = taskdeadline;
		this.employee = employee;
		this.taskcomplete = taskcomplete;
	}


	public Integer getTaskid() {
		return taskid;
	}


	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}


	public String getTaskname() {
		return taskname;
	}


	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}


	public String getTaskdescription() {
		return taskdescription;
	}


	public void setTaskdescription(String taskdescription) {
		this.taskdescription = taskdescription;
	}


	public String getTaskdeadline() {
		return taskdeadline;
	}


	public void setTaskdeadline(String taskdeadline) {
		this.taskdeadline = taskdeadline;
	}


	public String getTaskcomplete() {
		return taskcomplete;
	}


	public void setTaskcomplete(String taskcomplete) {
		this.taskcomplete = taskcomplete;
	}
	


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskname=" + taskname + ", taskdescription=" + taskdescription
				+ ", taskdeadline=" + taskdeadline +  ", taskcomplete=" + taskcomplete
				+ "]";
	}
	
	

}
