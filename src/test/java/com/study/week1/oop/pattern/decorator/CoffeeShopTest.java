package com.study.week1.oop.pattern.decorator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Ignore;
import org.junit.Test;

public class CoffeeShopTest {
	@Test
	public void testMochaCofee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getMochaCoffee();
				
		assertThat("모카커피 가격은 3000원 이다", beverage.cost(), is(3000));
	}
	
	@Test
	public void testIceMochaCofee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getIceMochaCoffee();
				
		assertThat("아이스 모카 커피 가격은 3500원 이다.", beverage.cost(), is(3500));
	}

	@Test
	@Ignore  // TODO 크림 커피를 만들어 봅시다. 크림은 저렴하게 100원으로.
	public void testIceCreamMochaCoffee() throws Exception {
		CoffeeShop coffeeShop = new CoffeeShop();
		Beverage beverage = coffeeShop.getIceCreamMochaCoffee();
		
		assertThat("아이스 크림 모카커피는 3600원 이다.", beverage.cost(), is(3600));
	}
	
	// TODO 에스프레소의 가격이 2500원으로 인상됐다.
	// EspressoBeverage 의 cost 를 2500원 으로 올리고 테스트 코드를 수정하라.
}
