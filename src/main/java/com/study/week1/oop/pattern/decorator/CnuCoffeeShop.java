package com.study.week1.oop.pattern.decorator;

/**
 * TODO
 * 
 * @author rokim
 *
 */
public class CnuCoffeeShop {
	public Beverage getMochaCoffee() {
		Beverage beverage = new EspressoBeverage();

		beverage = new WaterDecorator(beverage);
		beverage = new MochaDecorator(beverage);
		
		return beverage;
	}
	
	public Beverage getAmericano() {
		Beverage beverage = new EspressoBeverage();

		beverage = new WaterDecorator(beverage);
		
		return beverage;
	}
	
	public Beverage getIceMochaCoffee() {
		Beverage beverage = new EspressoBeverage();

		beverage = new WaterDecorator(beverage);
		beverage = new MochaDecorator(beverage);
		beverage = new IceDecorator(beverage);
		
		return beverage;
	}
	
	public Beverage getIceCreamMochaCoffee() {
		// TODO
		return null;
	}
}
