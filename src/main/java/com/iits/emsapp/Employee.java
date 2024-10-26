package com.iits.emsapp;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private List<Long> mno;
	private Address address;

	public Employee() {
		System.out.println("--Employee object is created by IOC--");
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setMno(List<Long> mno) {
		this.mno = mno;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", mno=" + mno + ", address=" + address
				+ "]";
	}

	 
	
	 

}
