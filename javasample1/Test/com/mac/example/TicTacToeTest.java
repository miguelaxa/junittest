package com.mac.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class TicTacToeTest {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	@BeforeMethod
	protected void setUp() throws Exception {
	}

	@AfterMethod
	protected void tearDown() throws Exception {
	}

	@Test
	public void testMousePressed() {
		System.out.println("pass");
		//fail("Not yet implemented");
	}

	@Test
	public void testInitBoard() {
		System.out.println("pass");
		//fail("Not yet implemented");
		//new change
	}

}
