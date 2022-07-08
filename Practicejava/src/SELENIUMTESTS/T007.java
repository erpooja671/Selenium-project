package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;


//Program to count total number of links in google.com

public class T007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://google.com");
		//driver1.findElement(By.partialLinkText("Sign")).click();
		int count = driver1.findElements(By.tagName("a")).size();
		System.out.println("total number of count is : " + count);
		
	      ArrayList total_links = new ArrayList();

		//List<WebElement> total_links = new ArrayList();
		total_links =  (ArrayList) driver1.findElements(By.tagName("a"));  // Total links on page
		ListIterator iterator1= total_links.listIterator();
		System.out.println(total_links(1));
		//driver1.findElements(by.)
		
		
		driver1.close();
		
	}

}
