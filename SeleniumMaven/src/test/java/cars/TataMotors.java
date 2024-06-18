package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotors 
{
	@Test(groups = "system")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://cars.tatamotors.com/nexon/ice.html?utm_source=TML_OMD_Search_Nexon_India&utm_medium=cpc&utm_campaign=tata_nexon_performance&gad_source=1&gclid=Cj0KCQjwvb-zBhCmARIsAAfUI2tlB1cfxvv97mvC4Jp1K56UQwjnYyNOVsLZb9rBS8l-i9sP7PMV0oQaAigrEALw_wcB");
		Reporter.log("maruti page executed",true);
	}

}
