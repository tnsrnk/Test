package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingBuilderTest {

	@Test
	public void testGetGreeting() {
		GreetingBuilder sut = new GreetingBuilder();
		String greeting = sut.getGreeting();
		assertEquals("Hello", greeting);
	}

}
