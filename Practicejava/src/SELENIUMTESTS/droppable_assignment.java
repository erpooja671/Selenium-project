package SELENIUMTESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.String;



public class droppable_assignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		/*String droppable_text= driver1.findElement(By.xpath("//*[@id='content']/H1")).getText();
		System.out.println(droppable_text);
	    // OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
  		//System.out.print(droppable_text);
		//System.console().writer().println(droppable_text);

  		//driver1.findElement(By.xpath("//*[@id='draggable']")).click();
  		Thread.sleep(3000);
  		driver1.switchTo().frame(driver1.findElement(By.className("demo-frame")));
   		Actions mover = new Actions(driver1);
   		WebElement target= driver1.findElement(By.className("ui-widget-header ui-droppable"));
   		WebElement source = driver1.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle"));
   		mover.dragAndDrop(target, source).build().perform();*/
		String Droppable = driver1.findElement(By.className("entry-title")).getText();

		//printing the text
		System.console().writer().println(Droppable);

		//initializing variable as int and assigning the frame size to it
		int size = driver1.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		//switching to frame
		driver1.switchTo().frame(driver1.findElement(By.className("demo-frame")));

		//initializing Actions
		Actions mover = new Actions(driver1);
		WebElement target = driver1.findElement(By.id("droppable"));
		WebElement pickup = driver1.findElement(By.id("draggable"));

		//dragging from pickup location and dropping at target
		mover.dragAndDrop(pickup,target).build().perform();

		//printing again
		System.console().writer().println(Droppable);
		Thread.sleep(3000);
		driver1.close();
	}
}
