package com.capgemini.client;

public class Student {
	private String name;
	private int age;
	private double studentId;
	private String favouriteFruit;

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

	public String getFruit() {
		return favouriteFruit;
	}

	public void setFruit(String favouriteFruit) {
		this.favouriteFruit = favouriteFruit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favouriteFruit == null) ? 0 : favouriteFruit.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (favouriteFruit == null) {
			if (other.favouriteFruit != null)
				return false;
		} else if (!favouriteFruit.equals(other.favouriteFruit))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Student(String name, int age, double studentId, String city) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		this.favouriteFruit = city;
	}
	
	

}
