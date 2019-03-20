package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
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
		firstStudent = new Student("Anil", 20, 121, "Mango");
		secondStudent = new Student("Rahul", 18, 122, "Orange");
		thirdStudent = new Student("Abhay", 21, 127, "Apple");

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

	@Test
	public void testFavouriteFruit() {
		HashMap<String, String> map = new HashMap<>();

		map.put(firstStudent.getName(), firstStudent.getFruit());
		map.put(secondStudent.getName(), secondStudent.getFruit());
		map.put(thirdStudent.getName(), thirdStudent.getFruit());
		
		assertEquals("Mango", map.get(firstStudent.getName()));
		assertEquals("Orange", map.get(secondStudent.getName()));
		assertEquals("Apple", map.get(thirdStudent.getName()));
		
		//assertEquals("[Anil Rahul Abhay]", map.keySet());
		assertTrue(map.keySet().contains(firstStudent.getName()));
		assertTrue(map.keySet().contains(secondStudent.getName()));
		assertTrue(map.keySet().contains(thirdStudent.getName()));
		
		assertTrue(map.values().contains(firstStudent.getFruit()));
		assertTrue(map.values().contains(secondStudent.getFruit()));
		assertTrue(map.values().contains(thirdStudent.getFruit()));
		
	}

}
