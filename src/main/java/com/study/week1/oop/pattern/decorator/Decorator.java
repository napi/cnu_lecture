package com.study.week1.oop.pattern.decorator;

public abstract class Decorator extends Beverage{
	private Beverage beverage;
	
	public Decorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public abstract String getDeco();
	public abstract int getDecoCost();
	
	@Override
	public String getDescription() {
		return getDeco() + beverage.getDescription();
	}
	
	@Override
	public int cost() {
		return getDecoCost() + beverage.cost();
	}
}
