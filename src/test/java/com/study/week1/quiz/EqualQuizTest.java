package com.study.week1.quiz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class EqualQuizTest {
	@Test
	public void test() throws Exception {
		int i, j;
		i = j = 100;		
		assertThat("기본형 비교", i == j, is(true));
		
		
		Integer n1 = new Integer(100);
		Integer n2 = new Integer(100);		
		assertThat("래퍼러 비교", n1 == n2, is(true));
	}
	
	@Test
	public void testEqual() throws Exception {
		EqualQuiz q1 = new EqualQuiz();
		EqualQuiz q2 = new EqualQuiz();
		q1.i = q2.i = 100;
						
		assertThat("객체 비교", q1.equals(q2), is(true));
		
		Object obj = new Object();
		Integer integer = new Integer(0);

		// TODO 설명 듣고, 테스트가 동작하도록 고쳐보아요.
	}
	
	@Test
	public void testString() throws Exception {
		String s1 = "Hello";
		String s2 = "Hello";
		
		assertThat("String equals", s1.equals(s2), is(true));
		assertThat("String 비교 s1 == s2", s1 == s2, is(false));
		
		String s3 = "He" + "llo";
		assertThat("String 비교 s1 == s3", s1 == s3, is(false));
		
		String s4 = "He";
		String s5 = "llo";
		assertThat("String 비교4 s1 == s4 + s5", s1 == s4 + s5, is(false));
		
		assertThat("String 비교5 s1 equals (s4+s5)", s1.equals(s4 + s5), is(true));
	}

}
