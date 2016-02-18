package com.kronos.parent.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kronos.parent.Sample;

public class SampleTest {

	@Test
	public void test() {
		Sample sample=new Sample();
		int sum= sample.calculateSum(2, 3);
		assertEquals(5, sum);;
	}

}
