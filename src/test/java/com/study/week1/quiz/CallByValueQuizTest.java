package com.study.week1.quiz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.study.week1.grammer.Person;

public class CallByValueQuizTest {
	@Test
	public void test() throws Exception {
		CallByValueQuiz quiz = new CallByValueQuiz();

		int i = 3;
		Integer integer = new Integer(9);
		String s = "HELLO";
		Person p = new Person(30, "robin");
		i = quiz.convert(i);
		integer = quiz.convert(integer);
		s = quiz.convert(s);
		p = quiz.convert(p);
		
		assertThat(i, is(0));
		assertThat(integer, is(9));
		assertThat(s, is("HEIIO"));
		assertThat(p.getAge(), is(30));
	}
}
