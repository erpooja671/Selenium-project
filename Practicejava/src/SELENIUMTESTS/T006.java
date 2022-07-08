package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T006 {
	public static void main  (String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		driver1.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver1.findElement(By.name("btnK")).click();
		driver1.findElement(By.linkText("Sign in")).click();
		driver1.close();
	}
}
