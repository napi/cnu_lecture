package com.study.week2.quiz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by rokim on 2016. 5. 15..
 */
public class StudentTest {
    @Test
    public void test() {
        Student freshman = Student.FRESHMAN;

        assertThat(freshman.getGrade(), is(1));
    }

    @Test
    public void testSetter() {
        Student freshman = Student.FRESHMAN;

        freshman.setGrade(4);

//        assertThat(freshman.getGrade(), is(1));
    }

    @Test
    public void testSetterAndNew() {
        Student freshman = Student.FRESHMAN;

        freshman.setGrade(4);
//        assertThat(freshman.getGrade(), is(1));

        Student newFreshMan = Student.FRESHMAN;
//        assertThat(freshman.getGrade(), is(1));
    }

}