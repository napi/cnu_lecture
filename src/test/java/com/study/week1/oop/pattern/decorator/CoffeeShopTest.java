package com.study.week1.oop.pattern.decorator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class CoffeeShopTest {
	@Test
	public void testMochaCofee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getMochaCoffee();
				
		assertThat(beverage.cost(), is(0));
	}
	
	@Test
	public void testIceMochaCofee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getIceMochaCoffee();
				
		assertThat(beverage.cost(), is(0));
	}

	// TODO 크림 커피를 만들어 봅시다. 크림은 저렴하게 100원으로.
	@Test
	public void testIceCreamMochaCoffee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getIceCreamMochaCoffee();
		
		assertThat(beverage.cost(), is(3600));
	}
	
	// TODO Decorator가 유연하지 않아요. cost 를 변경할 수는 없나요?
	// 가능하다. cost 를 Decorator 의 field 로 둠으로서 한단계 더 추상화가 가

	
	// TODO 저렴하고 맛있는 충남대 커피샵을 열어보아요
	
}
