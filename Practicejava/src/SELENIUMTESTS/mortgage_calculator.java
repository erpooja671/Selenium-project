package SELENIUMTESTS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mortgage_calculator 
{
	
	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.mortgagecalculator.org/");
		driver1.findElement(By.name("param[homevalue]")).sendKeys("4000");
		driver1.findElement(By.id("downpayment")).sendKeys("1500");
		driver1.findElement(By.xpath("//*[@value='percent' and @type='radio' and @name='param[downpayment_type]']")).click();  ////Xpath can be //input[@value='percent' and @type='radio' and @name='param[downpayment_type]']"
		driver1.findElement(By.id("intrstsrate")).sendKeys("4.5");
		Thread.sleep(5000);
		driver1.findElement(By.name("cal")).click();
		String EMI= driver1.findElement(By.xpath("//div[@class='cal-right-box']/div/div[1]/div[1]/h3")).getText();   //div[@class='cal-right-box']/div/div[1]/div[1]/h3
		System.out.println(EMI);
		driver1.close();
		
	}

}
