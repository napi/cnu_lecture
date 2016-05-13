package com.study.week1.grammer;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallByReferenceExampleTest {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void test() throws Exception {
		CallByReferenceExample example = new CallByReferenceExample();
		
		assertThat(example.getPerson("robin").getAge(), is(30));
		assertThat(example.getPerson("tony").getAge(), is(45));
		assertThat(example.getPerson("sam").getAge(), is(40));
	}
	
	@Test
	public void test2() throws Exception {
		CallByReferenceExample example = new CallByReferenceExample();
		
		// Client 1
		Person robinFromClient1 = example.getPerson("robin");
		assertThat(robinFromClient1.getAge(), is(30));
		assertThat(robinFromClient1.getMmr(), is(0L));
		
		
		// Client 2 (Admin)
		Person robinFromAdmin = example.getPerson("robin");
		robinFromAdmin.setMmr(1750L);
		assertThat(robinFromAdmin.getAge(), is(30));
		assertThat(robinFromAdmin.getMmr(), is(1750L));

		
		// Client 3
		Person robinFromClient3 = example.getPerson("robin");
		assertThat(robinFromClient3.getAge(), is(30));
		assertThat(robinFromClient3.getMmr(), is(0L));
	}
}
