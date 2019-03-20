package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Car;

public class CarTest {

	private Car bmwCar;
	private Car marutiCar;
	private Car hyundaiCar;

	@Before
	public void setUp() {
		bmwCar = new Car("BMW", "XL", 2017, 3400000);
		marutiCar = new Car("Maruti", "800", 2011, 240000);
		hyundaiCar = new Car("Hyundai", "Verna", 2016, 230000);

	}

	@Test
	public void testOrderUsingList() {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(bmwCar);
		cars.add(marutiCar);
		cars.add(hyundaiCar);

		Iterator<Car> it = cars.iterator();
		assertEquals(bmwCar, it.next());
		assertEquals(marutiCar, it.next());

	}

	@Test
	public void testForQuality() {
		HashSet<Car> cars = new HashSet<>();
		cars.add(bmwCar);
		cars.add(marutiCar);
		cars.add(hyundaiCar);
		cars.add(bmwCar);
		assertEquals(3, cars.size());

	}

	@Test
	public void testForEquality() {
		assertEquals(1, bmwCar.getMakeOfCar().compareTo(hyundaiCar.getMakeOfCar()));
	}

}
