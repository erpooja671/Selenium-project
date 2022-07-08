package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.util.*;

public class T005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.get("https://www.facebook.com");
			
			driver1.findElement(By.id("email")).sendKeys("erpooja671");
			driver1.findElement(By.name("pass")).sendKeys("9971120020");
			driver1.findElement(By.name("login")).click();
}
	}