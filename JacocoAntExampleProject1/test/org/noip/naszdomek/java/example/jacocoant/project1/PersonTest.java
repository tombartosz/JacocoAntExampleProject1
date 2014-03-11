package org.noip.naszdomek.java.example.jacocoant.project1;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetName() {
		String name = "Janko Muzykant";
		Person p = new Person(name, null);
		assertEquals(name, p.getName());
	}

	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(1990, 1, 1);
		Date birthDate = c.getTime();
		Person p = new Person(null, birthDate);
		assertTrue(p.getAge() > 20);
		assertTrue(p.getAge() < 30);
	}

}
