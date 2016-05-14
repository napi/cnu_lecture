package com.study.week1.oop.pattern.decorator;

public class EspressoBeverage extends Beverage {

	public EspressoBeverage() {
		this.description = " with 에스프레소";
	}
	
	@Override
	public int cost() {
		return 2000;
	}

}
