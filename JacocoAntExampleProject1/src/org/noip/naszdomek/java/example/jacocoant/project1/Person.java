package org.noip.naszdomek.java.example.jacocoant.project1;

import java.util.Calendar;
import java.util.Date;

public class Person {

	private final String name;
	private final Date birthDate;

	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		Calendar curr = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.setTime(this.birthDate);
		return curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
	}
}
