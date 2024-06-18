package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HyundaiTest 
{
	@Test(groups = "smoke")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tridenthyundai.com/?utm_source=google&utm_medium=cpc&utm_campaign=search&gad_source=1&gclid=Cj0KCQjwvb-zBhCmARIsAAfUI2vfbTHcCTWi_URg1BWrcLetGhC2-b0mTR7bZqkcmhKv9yQ2hhAEqV0aAgLkEALw_wcB");
		Reporter.log("hyundai page executed",true);
	}

}
