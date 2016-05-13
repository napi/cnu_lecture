package com.study.week1.quiz;

import com.study.week1.grammer.Person;

public class CallByValueQuiz {
	public int convert(int i) {
		i -= 3;
		return i;
	}

	public String convert(String s) {
		s = s.replace("L", "l");
		return s;
	}
	
	public Integer convert(Integer i) {
		return Integer.valueOf(i);
	}

	public Person convert(Person p) {
		p.setAge(30);
		
		//p = new Person(50, "albert");
		return p;
	}
}
