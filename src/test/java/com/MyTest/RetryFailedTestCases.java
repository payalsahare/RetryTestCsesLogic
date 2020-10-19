package com.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTestCases {
	
	//retry logic for all 100 cases then its not comfore to write 100 times this line
	@Test()
	public void test1()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, true);
	}
}

