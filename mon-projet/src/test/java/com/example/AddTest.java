package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {
	@TEST
	public void addTest()
	int a, b, res = 2, 3, 5;
	
	Add obj = new Add();
	
	assertEquals(res, obj.add(a, b));
}