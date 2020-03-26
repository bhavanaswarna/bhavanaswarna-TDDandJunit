package com.maven.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class DeleteATest {

	@Test
	public void testRemoveA() {
		DeleteA test1 =new DeleteA();
		assertEquals("BAD",test1.removeA("AABAD"));
	}
	@Test
	public void testRemoveA1() {
		DeleteA test2 =new DeleteA();
		assertEquals("BCD",test2.removeA("BCD"));
	}
	@Test
	public void testRemoveA2() {
		DeleteA test3 =new DeleteA();
		assertEquals("BCD",test3.removeA("BACD"));
	}
	@Test
	public void testRemoveA3() {
		DeleteA test4 =new DeleteA();
		assertEquals("",test4.removeA("AA"));
	}
	@Test
	public void testA4() {
		DeleteA test5 =new DeleteA();
		assertEquals("bcd",test5.removeA("abcd"));
	}

}
