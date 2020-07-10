package com.jaya.training.jenkins5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest(){
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10,myCalc.addNumbers(5,5));
		}

	@Test
	public void suntractTest(){
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5,myCalc.suntractNumbers(10,5));
		}

}
