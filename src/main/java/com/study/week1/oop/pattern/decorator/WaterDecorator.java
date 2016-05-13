package com.study.week1.oop.pattern.decorator;

public class WaterDecorator extends Decorator {
	public WaterDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int getDecoCost() {
		return 200;
	}

	@Override
	public String getDeco() {
		return " +물";	
	}
}
