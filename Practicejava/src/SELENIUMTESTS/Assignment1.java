package SELENIUMTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//package net.javaguides.corejava.controlstatements.ifelse;


import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter Browser to be open");
		String Browser1= input1.nextLine();
		
		input1.close();
		System.out.println("Entered Browser is  " +Browser1);
		
		 if(Browser1.contains("chrome"))  //not running when using equals
		 {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
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
		 else if (Browser1.contains("Firefox"))
		 {
		   //not running when using equals
		 
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Java\\geckodriver.exe");
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
		 else
		 {
			 System.out.println("Try Again");
		 }
		
			//System.out.println(driver1.getTitle());
			
	}

}
