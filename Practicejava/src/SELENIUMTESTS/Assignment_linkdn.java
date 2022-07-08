package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_linkdn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://linkedin.com");
		driver1.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		String Title =driver1.getTitle();
		
		System.out.println(Title);
		if (Title.contains("Reset Password"))
		{
			System.out.println("Reset password page Title is: " + Title);
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver1.findElement(By.linkText("Join now")).click();
		String jointitle=driver1.getTitle();
		System.out.println("Join now page title is: " +jointitle);
		if (jointitle.contains("Sign Up"))
		{
			System.out.println("Join now page Title is " + jointitle);
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver1.findElement(By.linkText("Sign in")).click();
		String sign_in_title=driver1.getTitle();
		System.out.println("Sign In page title is: " +sign_in_title);
		if (sign_in_title.contains("Sign in"))
		{
			System.out.println("Sign In page Title is " + sign_in_title);
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver1.findElement(By.id("username")).sendKeys("adminaccount");
		driver1.findElement(By.name("session_password")).sendKeys("12345");
		driver1.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		Thread.sleep(5000);
		String login_error = "Please enter a valid username";
	    WebElement login_error_msg= driver1.findElement(By.id("error-for-username"));
	    login_error = login_error_msg.getText();
	    if (login_error.contains("Please enter a valid username"))
	    {
	    	System.out.println("Got error on wrong username so it is Pass");
	    }
	    else 
	    {
	    	System.out.println("No error in login so Fail");
	    }
		
	driver1.close();
	}

}
