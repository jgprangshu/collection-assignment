package com.capgemini.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.client.Television;

public class TelevisionTest {

	private static Television lg;
	private static Television samsung;
	private static Television sony;

	@Before
	public void setUp() {
		lg = new Television("LG", "LCD", "enabled", 34000);
		samsung = new Television("Samsung", "LED", "enabled", 24000);
		sony = new Television("Sony", "Plasma", "notEnabled", 23000);
	}

	@Test
	public void testOrderUsingList() {
		ArrayList<Television> television = new ArrayList<>();
		television.add(lg);
		television.add(samsung);
		television.add(sony);
	}

	@Test
	public void testForQuality() {
		HashSet<Television> television = new HashSet<>();
		television.add(lg);
		television.add(samsung);
		television.add(sony);
		television.add(lg);
		assertEquals(3, television.size());

	}

}