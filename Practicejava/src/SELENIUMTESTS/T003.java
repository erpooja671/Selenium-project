package SELENIUMTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.logging.*;
//import org.openqa.selenium.logging.profiler.*;


import java.util.*;
import java.util.logging.Level;

public class T003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.silentOutput", "true"); //tp supress drive related information
			
			java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);


			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			   

			driver1.get("https://www.facebook.com");
			//driver1.wait(1000);
			System.out.println("Title is: " + driver1.getTitle());
			System.out.println("Current URL is: " +driver1.getCurrentUrl());
			
		driver1.close();
	}

}
