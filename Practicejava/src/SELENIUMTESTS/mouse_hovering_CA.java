package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouse_hovering_CA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.youcandealwithit.com/");
		Actions action1 = new Actions(driver1);
		action1.moveToElement(driver1.findElement(By.linkText("BORROWERS"))).build().perform();
		
		driver1.findElement(By.linkText("Calculators & Resources")).click();
		driver1.findElement(By.linkText("Calculators")).click();
		driver1.findElement(By.linkText("Budget Calculator")).click();
		
		Thread.sleep(5000);
		
		driver1.close();

	}

}
