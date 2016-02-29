package com.devops.testantproject;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;



public class HelloWorldTest {

	HelloWorld hw = new HelloWorld("Hello ");
	
	@Test
	public void testGrittingMessage(){		
		assertEquals("Hello J",hw.getGreetins() );
	}
	
}
