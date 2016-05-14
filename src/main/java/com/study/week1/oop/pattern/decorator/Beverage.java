package com.study.week1.oop.pattern.decorator;

public abstract class Beverage {
	protected String description = "";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int cost();
	
	public String show() {
		String name = getDescription();
		double cost = cost();
		
		return "name : " + name + ", cost : " + cost;
	}
}
