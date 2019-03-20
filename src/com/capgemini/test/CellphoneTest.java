package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.client.Cellphone;

public class CellphoneTest {

		private static Cellphone firstCellphone;
		private static Cellphone secondCellphone;
		private static Cellphone thirdCellphone;
		private static Cellphone duplicateCellphone;

		@BeforeClass
		public static void setUp() {
			firstCellphone = new Cellphone("Nokia", "ySeries", "hgdf", "Android",3400);
			secondCellphone = new Cellphone("Samsung", "XL", "jksdbf", "Android",7000);
			thirdCellphone = new Cellphone("Apple", "6s","klsv", "ios",60000);
			duplicateCellphone = new Cellphone("Samsung", "XL", "jksdbf", "Android",7000);

		}
		
		
		@Test
		public void testForQuality() {
			HashSet<Cellphone> Cellphones = new HashSet<>();
			Cellphones.add(firstCellphone);
			Cellphones.add(secondCellphone);
			Cellphones.add(thirdCellphone);
			Cellphones.add(duplicateCellphone);
			assertEquals(3, Cellphones.size());

		}
		
		
		
}
