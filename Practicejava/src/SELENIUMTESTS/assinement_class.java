package SELENIUMTESTS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.lang.Thread;


public class assinement_class {

	
	public static void main (String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			
			driver1.manage().window().maximize();
			
			driver1.get("https://amazon.in");
			Actions action1 = new Actions(driver1);
			action1.moveToElement(driver1.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
			driver1.findElement(By.linkText("Sign in")).click();
			String title = driver1.getTitle();
			System.out.println(driver1.getTitle());
			
			Thread.sleep(5000);
			
			if (title.equals("Sign In"))
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
