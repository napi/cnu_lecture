package com.study.week1.oop.pattern.decorator;

public class IceDecorator extends Decorator {
	public IceDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int getDecoCost() {
		return 500;
	}

	@Override
	public String getDeco() {
		return " +얼음";
	}


}
