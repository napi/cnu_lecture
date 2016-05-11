package com.study.week1.oop.pattern.decorator.none;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class DabangTest {
	private Dabang dabang;
	
	@Before
	public void init() {
		dabang = new Dabang();
	}
	
	@Test
	public void testMocaCoffee() throws Exception {
		assertThat(dabang.getMocaCoffeePrice(), is(3000));
	}
	
	@Test
	public void testIceCoffee() throws Exception {
		assertThat(dabang.getIceCoffeePrice(), is(2700));
	}

	@Test
	public void testIceMocaCoffee() throws Exception {
		assertThat(dabang.getIceMocaCoffeePrice(), is(3500));
	}
}
