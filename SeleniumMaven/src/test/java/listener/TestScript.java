package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScript 
{
	@Test
	public void clickOnBooks()
	{
		Reporter.log("open browser",true);
		Reporter.log("navigate to url",true);
		Reporter.log("login",true);
		Reporter.log("click on books",true);
		Assert.fail();
		Reporter.log("logout",true);
		Reporter.log("close browser",true);
	}

}
