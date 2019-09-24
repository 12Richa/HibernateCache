package com.nt.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eno;
	private String ename;
	private String job;
	private float salary;
	
	public Employee() {
		System.out.println("Employee:::0-param constructor...");
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + "]";
	}

}
