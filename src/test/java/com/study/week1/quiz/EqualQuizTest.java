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
		// matcher 'is(true)' 를 유지한 체로 테스트 코드 수정.
		assertThat("래퍼러의 == 비교", n1.equals(n2), is(true));		
	}
	
	@Test
	public void testEqual() throws Exception {//EqualQuiz자체를 수정해서 할 것
		EqualQuiz q1 = new EqualQuiz();
		EqualQuiz q2 = new EqualQuiz();
		q1.i = q2.i = 100;

		// TODO 설명 듣고, 테스트가 동작하도록 EqualQuiz.java 파일을 수정.
		assertThat("객체 비교", q1.equals(q2), is(true)); // EqualQuiz에서 equals를 재정의해서 사용
		
		
		// Object 객체의 상속 구조와 equals 메서드의 Override에 대해 설명.
		Object obj = new Object();
		Integer integer = new Integer(0);
	}
	//equals가서 보기.. String과 Integer 등등 클래스마다 구현이 다름
	@Test
	public void testString() throws Exception {
		String s1 = "Hello";
		String s2 = "Hello";//컴파일러가 s1과 s2가 동일한 문자열을 가지므로 동일한 객체를 가리키게 한다. 두 객체를 생성하는게 아님
		
		//만약 String s3 = "hello"; 이렇게 선언되면 다른 객체가 생성됨 ^오^b
		
		assertThat("String equals", s1.equals(s2), is(true));
		assertThat("String 은 객체인데 s1 == s2가 true 라니!?", s1 == s2, is(true));// 
	}
	
	@Test
	public void testStringConcat() throws Exception {
		String s1 = "Hello";
		String s2 = "He" + "llo"; // 컴파일러가 Hello라고 생각하고 동일한 참조를 부여
		
		assertThat("Hello == 'He' + 'llo' => true", s1.equals(s2), is(true));
		assertThat("Hello == 'He' + 'llo' => true", s1 == s2, is(true));
	}
	
	@Test
	public void testStringConcat2() throws Exception {
		String s1 = "Hello";
		String s2 = "He";
		String s3 = "llo";
		
		String s4 = s2 + s3;
		
		assertThat("Hello == 'He' + 'llo' => false", s1.equals(s4), is(true));
		assertThat("Hello == 'He' + 'llo' => false", s1 == s4, is(true));
	}
	
	@Test
	public void testNewString() throws Exception {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		assertThat(s1 == s2, is(true));
	}
}
