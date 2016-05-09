package com.study.week1.quiz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class AutoBoxingTest {
	@Test
	public void testName() throws Exception {
		AutoBoxing autoBoxing = new AutoBoxing();
		
		assertThat("결과를 추측해보세요.", new String(autoBoxing.getAutoBoxing()), is("0Ab"));
	}
}
