package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNum {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.AddNumbers(100,200);
		assertEquals(300,result);
	}

}
