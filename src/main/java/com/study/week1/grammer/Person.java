package com.study.week1.grammer;

public class Person {
	private int age;
	private String name;
	private long mmr;		// this is secret infomation.
	
	public Person() {
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	


	public Person(Person person) {
		this.age = person.getAge();
		this.name = person.getName();
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getMmr() {
		return mmr;
	}

	public void setMmr(long mmr) {
		this.mmr = mmr;
	}
	
	
	
}
