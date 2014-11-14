package com.example.lab1.test;

import android.test.AndroidTestCase;
import com.example.lab1.Util;

public class TestAdd extends AndroidTestCase {
	
	public TestAdd() {
		super();
	}
	
	protected void setUp() {
		
	}
	
	protected void tearDown() {
		
	}
	
	public void testMath() {
		assertTrue(Util.multiply(3, 6) == 18);
		assertTrue(Util.multiply(-12, 4) == -48);
		assertTrue(Util.multiply(0, 7) == 0);
		assertTrue(Util.nthRootOfN(8, 3) == 2.0);
	}
}
