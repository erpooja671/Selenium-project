package SELENIUMTESTS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.lang.Thread;
import org.openqa.selenium.support.ui.Select;


public class spicejet {

	
	public static void main (String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			
			driver1.manage().window().maximize();
			
			driver1.get("https://www.spicejet.com/");
			Thread.sleep(3000);
			driver1.findElement(By.xpath("//div[contains(text(),'From')]")).click();
			
			//driver1.findElement(By.xpath("//*[@class='r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2']")).getText();
			driver1.findElement(By.xpath("//*[contains(text(),'Hyderabad')]")).click();
			Thread.sleep(3000);
			//driver1.findElement(By.xpath("//*[contains(text(),'To')]")).click();
			
			driver1.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2' and text='To']")).click();
			Thread.sleep(3000);
			
			driver1.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar' and text='GOI']")).click();
			
			
			//WebElement toCountry = driver1.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[3]/div/div[2]/input"));
			//toCountry.sendKeys("GOA");
			//driver1.findElement(By.xpath("//*[contains(text(),'Goa')]")).sendKeys("Goa");
			Thread.sleep(3000);
			driver1.findElement(By.xpath("//*[contains(text(),'Departure Date')]")).click();
			driver1.findElement(By.xpath("//*[contains(text='27')]")).click();
			Thread.sleep(3000);
			
			driver1.findElement(By.xpath("//*[@class='css-1dbjc4n']")).click();
			
		//From_city.sendKeys("Hydera");
			
			
			//driver1.findElement(By.xpath("//div[contains(text(),'International')]")).click();
			//WebElement From_source = driver1.findElement(By.className("css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep"));
			//Select select_from = new Select (From_source);
			//select_from.selectByVisibleText("Hyderabad(HYD)");
			//System.out.println(select_from);
			
			//select_from.selectByValue("Hyderabad(HYD)");
			Thread.sleep(5000);
			//Actions action1 = new Actions(driver1);
			//action1.moveToElement(driver1.findElement(By.className("css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu"))).build().perform();
			/*
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
			
	*/
			
			
						driver1.close();
		}

		}
