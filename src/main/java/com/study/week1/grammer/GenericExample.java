package com.study.week1.grammer;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	public List<Person> getPersonList() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(21, "robin"));
		
		return personList;
	}
	
	public List getPersonList(int age) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(age, "robin"));
		
		return personList;
	}

}
