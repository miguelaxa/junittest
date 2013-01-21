package com.mac.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class StartPointTest {

	private StartPoint startPoint;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeMethod
	public void setUp() throws Exception {
		startPoint = new StartPoint();

	}

	@AfterMethod
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdder() {
		
		AssertJUnit.assertEquals("Result", 26, startPoint.adder(24, 2));
	}

	@Test
	public void test() {

		int add_ans = startPoint.adder(24, 2);

		if (add_ans == 26) {
			System.out.println("good 1");
		} else {
			System.out.println("good bad ans = " + add_ans);
			Assert.fail("Not yet implemented");

		}
	}

}
