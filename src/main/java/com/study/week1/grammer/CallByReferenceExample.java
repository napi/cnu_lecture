package com.study.week1.grammer;

import java.util.HashMap;
import java.util.Map;

public class CallByReferenceExample {
	private Map<String, Person> classMap;
	
	public CallByReferenceExample() {
		classMap = new HashMap<>();
		
		Person person1 = new Person(30, "robin kim");
		classMap.put("robin", person1);
		
		Person person2 = new Person(45, "tony chi");
		classMap.put("tony", person2);
		
		Person person3 = new Person(40, "sam ryoo");
		classMap.put("sam", person3);
	}
	
	public Person getPerson(String firstName) {
		if (this.classMap.containsKey(firstName)) {
			return this.classMap.get(firstName);
		}
		
		return null;
	}
}
