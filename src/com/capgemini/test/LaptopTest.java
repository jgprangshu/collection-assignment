package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Laptop;

public class LaptopTest {

	private static Laptop dellLaptop;
	private static Laptop hpLaptop;
	private static Laptop asusLaptop;

	@BeforeClass
	public static void setUp() {
		dellLaptop = new Laptop("Dell", "inspiron", "Windows", "i7");
		hpLaptop = new Laptop("HP", "inspiron", "Windows", "i7");
		asusLaptop = new Laptop("Asus", "Young", "Mac", "i3");

	}

	@Test
	public void testNumberOfElementsWithDuplicateValues() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(asusLaptop);
		laptops.add(hpLaptop);
		assertEquals(4, laptops.size());

	}

	@Test
	public void testForQuality() {
		HashSet<Laptop> laptops = new HashSet<>();
		laptops.add(dellLaptop);
		laptops.add(hpLaptop);
		laptops.add(asusLaptop);
		laptops.add(hpLaptop);
		assertEquals(3, laptops.size());

	}
	


}
