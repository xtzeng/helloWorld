package com.xt.lang;

import org.junit.Test;

public class StringTest {

	
	/**
	 * String[]	split(String regex)
	 * Splits this string around matches of the given regular expression.
	 */
	@Test
	public void testSplit() {
		String str = "boo:and:foo";
		String[] strArray = null;
		strArray = str.split(":");
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
	}
}
