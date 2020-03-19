package com.epam.tddjunit;

import static org.junit.Assert.*;

import org.junit.Test;



public class Removefirst2AsTest {
	/*
	 * TODO list for my features
	 * 1. firstchar      :ABCD ==> BCD-success
	 * 2. firsttwochar   :AACD=>CD-success
	 * 3. secondchar     :BACD=>BCD-success
	 * 4. noA's          :BCD=>BCD-success
	 * 5.Lastchar        :BCDA=>BCDA-success
	 * 6.first2lst2chars :AABAA=>BAA-success
	 * 7.emptychar       : " "=>" "-sucess
	 * 
	 */
	Removefirst2A removeA = new Removefirst2A();

	@Test
	public void testfirstchar() {

		assertEquals("BCD",removeA.remove("ABCD"));
	}
	@Test
	public void testfirsttwochar() {

		assertEquals("CD",removeA.remove("AACD"));
	}
	@Test
	public void testsecondchar() {

		assertEquals("BCD",removeA.remove("BACD"));
	}
	@Test
	public void testnoAs() {
		assertEquals("BCD",removeA.remove("BCD"));
	}
	@Test
	public void testLastchar() {

		assertEquals("BCDA",removeA.remove("BCDA"));
	}
	@Test
	public void test1st2Aslast2As() {

		assertEquals("BAA",removeA.remove("AABAA"));
	}

	@Test
	public void testempty() {

		assertEquals("", removeA.remove(""));
	}

}
