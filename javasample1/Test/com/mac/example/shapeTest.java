/**
 * 
 */
package com.mac.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

/**
 * @author mac
 * 
 */
public class shapeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testShape() {
		shape myShape = new shape(3, "red");
		AssertJUnit.assertEquals("Result", 16, myShape.multShape(2, 2, 4));
	}

	@Test
	public void testPshape() {
		shape myShape = new shape(6, "blue");
		AssertJUnit.assertEquals("Result", 8, myShape.multShape(2, 2, 4));
	}

	@Test
	public void testmmshape() {
		shape myShape = new shape(9, "yellow");
		AssertJUnit.assertEquals("Result", 146, myShape.multShape(12, 12, 2));
	}

}
