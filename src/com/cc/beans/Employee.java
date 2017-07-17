package com.cc.beans;

public class Employee {
	private int id;
	private String name;
	private Long salary;

	public Employee(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
