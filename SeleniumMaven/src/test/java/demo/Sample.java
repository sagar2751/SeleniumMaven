package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample 
{
	@Test
	public void test()
	{
		Reporter.log("Sample page executed",true);
	}

}
