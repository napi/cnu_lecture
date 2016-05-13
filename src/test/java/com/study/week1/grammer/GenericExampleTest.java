package com.study.week1.grammer;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class GenericExampleTest {
	@Test
	public void testPersonList() throws Exception {
		GenericExample example = new GenericExample();
		
		List<Person> personList = example.getPersonList();
		
		for (int i = 0 ; i < personList.size() ; i++) {
			assertThat(personList.get(i).getAge(), is(21));
		}
		
		for (Person person : personList) {
            assertThat(person.getAge(), is(21));
        }
	}
	
	@Test
	public void testPersonList2() throws Exception {
		GenericExample example = new GenericExample();
		
		int testAge = 30;
		List personList = example.getPersonList(testAge);
		
		for (int i = 0 ; i < personList.size() ; i++) {
			Object obj = personList.get(i);
			if (obj instanceof Person) {
				assertThat(((Person)obj).getAge(), is(testAge));	
			} else {
				fail("Unexpected object");
			}
		}
		
	}
}
