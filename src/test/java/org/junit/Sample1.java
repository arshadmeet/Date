package org.junit;

public class Sample1 {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("afterclass");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}




}
