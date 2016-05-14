package com.study.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.study.exception.InvalidNotationException;
import com.study.exception.UnexpectedTokenException;

public class CalculateServiceTest {
	private CalculateService calculateService;
	@Before
	public void init() {
		calculateService = new CalculateService();
	}
	
	@Test
	@Ignore	// TODO
	public void test1() throws Exception {
		String s = "1 + 2 * 3 + ( 2 + 3 )";
		
		assertThat(calculateService.calculate(s), is(12));
	}
	
	@Test
	@Ignore // TODO
	public void test2() throws Exception {
		String s = "1 + ( 2 + 2 ) * ( 2 + 3 )";
		
		assertThat(calculateService.calculate(s), is(21));
	}
	
	@Test
	@Ignore // TODO
	public void test3() throws Exception {
		String s = "( 1 + ( 2 + 2 ) ) * ( 2 + 3 )";
		
		assertThat(calculateService.calculate(s), is(25));
	}

	@Test(expected = UnexpectedTokenException.class)
	@Ignore // TODO
	public void test4() throws Exception {
		String s = "( s + ( 2 + 2 ) ) * ( 2 + 3 )";
		
		assertThat(calculateService.calculate(s), is(25));
	}

	@Test(expected = InvalidNotationException.class)
	@Ignore // TODO
	public void test5() throws Exception {
		String s = "( 1 + ( 2 2 ) ) * ( 2 + 3 )";
		
		assertThat(calculateService.calculate(s), is(25));
	}

}
