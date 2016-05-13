package com.study.week1.grammer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericExample {
	public List<Person> getPersonList() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(21, "robin"));
		
		return personList;
	}
	
	// Method Overload!!!
	public List getPersonList(int age) {
		List personList = new ArrayList();
		personList.add(new Person(age, "robin"));

		return personList;
	}

}
