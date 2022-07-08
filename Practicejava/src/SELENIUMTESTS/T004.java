package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.lang.Thread;

public class T004 {
	public static void main (String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("email")).sendKeys("samsaravananr");
		driver1.findElement(By.name("pass")).sendKeys("12345");
       // Thread.sleep(100);
		driver1.findElement(By.name("login")).click();
		driver1.wait(1000);
		WebElement err = driver1.findElement(By.className("_9ay7"));
		//err.click();
		String errmsg="The password that you've entered is incorrect. ";
		//err = driver1.findElement(By.className("_9ay7"));
		errmsg=err.getText();
				
		if (errmsg.contains("The password that you've entered is incorrect. "))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver1.close();
	}

	private static String String(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
