package com.study.week1.oop.pattern.singleton;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class OldSingletonTest {

	@Test
	public void testUniqueInstance() throws Exception {
//		OldSingleton oldSingleton = new OldSingleton();		compile error
		
		OldSingleton singleton1 = OldSingleton.getInstance();
		OldSingleton singleton2 = OldSingleton.getInstance();
		
		assertThat("객체간의 == 비교는 false가 되어야 하는 걸까?", singleton1 == singleton2, is(false));
	}
}
