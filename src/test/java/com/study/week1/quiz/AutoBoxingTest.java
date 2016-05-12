package com.study.week1.quiz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class AutoBoxingTest {
	@Test
	public void test() throws Exception {
		AutoBoxing autoBoxing = new AutoBoxing();
		
		assertThat("결과를 추측해보세요.", new String(autoBoxing.getAutoBoxing()), is("0Ab"));
	}
	
	@Test
	public void testAutoBoxing() {
		Integer integer = 10;	// auto boxing
		
		assertThat(integer, is(10));	// unboxing
		assertThat(integer, is(new Integer(10)));
		
		assertThat(integer == 10, is(true));	
		assertThat("Wrapper 끼리의 == 비교는... 안된다.", integer == new Integer(10), is(true));
	}
}
