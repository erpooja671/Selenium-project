package TESTNGDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.*;

public class T001
{
		@Test
		public void TS001()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.facebook.com");
		//driver1.wait(1000);
		String title=driver1.getTitle();
		if (title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Title verification Passed");
		}
		else 
		{
			System.out.println("Title verification is failed");
		}
		driver1.close();
}
}