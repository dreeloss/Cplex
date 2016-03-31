package com.kronos.parent.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kronos.parent.Sample;

public class SampleTest {


	@Test
	public  void testCplex_Hello() {
		Sample Cplex=new Sample();
	    int sum= Cplex.model1(4, 3);
		assertEquals(7, sum);
	}

}


