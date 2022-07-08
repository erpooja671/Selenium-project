package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.lang.String;



public class mouse_hover_HA {

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
		driver1.findElement(By.id("food")).sendKeys("300");
		driver1.findElement(By.id("clothing")).sendKeys("100");
		driver1.findElement(By.id("shelter")).sendKeys("200");
		driver1.findElement(By.id("monthlyPay")).sendKeys("2000");
		driver1.findElement(By.id("monthlyOther")).sendKeys("200");
		Thread.sleep(5000);
		
		String total_monthly_income = driver1.findElement(By.id("totalMonthlyIncome")).getAttribute("value");                 
		String total_monthly_expenses = driver1.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
	   String under_over_budget = driver1.findElement(By.id("underOverBudget")).getAttribute("value");
		
		System.out.println("Total monthly income is : " +total_monthly_income);
		System.out.println("Total monthly Expense is : " +total_monthly_expenses);
		System.out.println("Total under or over budget is : " +under_over_budget);
		

		
		if (total_monthly_income.equals(total_monthly_expenses))
		{
			System.out.println("Income is more than expenses..your savings are amazing");
		}
		else
		{
			System.out.println("Income is less than expenses..you need to improve savings");
		}
		
		
		Thread.sleep(5000);
		
		driver1.close();
	}
	}

