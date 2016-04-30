package com.study.week1.oop.pattern.decorator;

public class MochaDecorator extends Decorator {
	public MochaDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int getDecoCost() {
		return 800;
	}

	@Override
	public String getDeco() {
		return " +모카";	
	}


}
