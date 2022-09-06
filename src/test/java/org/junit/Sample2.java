package org.junit;

public class Sample2 {
	@Test
	public void test1() {
		String s = "Aiite";
		Assert.assertEquals(s,"Aiite");
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		String s = "Aiite";
		Assert.assertTrue(s.contains("B"));
	}
	
	@Test
	public void test4() {
		String s = "Aiite";
		Assert.assertFalse(s.contains("B"));
	}

}
