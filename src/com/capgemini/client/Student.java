package com.capgemini.client;

public class Student {
	private String name;
	private int age;
	private double studentId;
	private String city;

	public Student() {
		super();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getStudentId() {
		return studentId;
	}

	public void setStudentId(double studentId) {
		this.studentId = studentId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String name, int age, double studentId, String city) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.city = city;
	}
	
	

}
