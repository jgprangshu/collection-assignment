package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Student;

public class CarTest {
	
		private static Student firstCar;
		private static Student secondCar;
		private static Student thirdCar;

		@BeforeClass
		public static void setUp() {
			firstCar = new Student("BMW", "XL", 2017, 3400000);
			secondCar = new Student("Maruti", "800",2011, 240000);
			thirdCar = new Student("Hyundai", "Verna", 2016, 230000);

		}

}
