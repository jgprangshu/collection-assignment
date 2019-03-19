package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Student;


public class StudentTest {
	private static Student firstStudent;
	private static Student secondStudent;
	private static Student thirdStudent;

	@BeforeClass
	public static void setUp() {
		firstStudent = new Student("Anil", 20, 121, "Delhi");
		secondStudent = new Student("Rahul", 18, 122, "Mumbai");
		thirdStudent = new Student("Abhay", 21, 127, "Lucknow");

	}
	
	@Test
	public void testOrderUsingList() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(firstStudent);
		students.add(secondStudent);
		students.add(thirdStudent);

		Iterator<Student> it = students.iterator();
		assertEquals(firstStudent, it.next());
		assertEquals(secondStudent, it.next());

	}

}
