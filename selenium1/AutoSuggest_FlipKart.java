package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*--22)Complete the assignment of selecting the 4th auto suggestion item on the flipkart application by searching shoes*/
public class AutoSuggest_FlipKart
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement w=driver.findElement(By.name("q"));
		w.sendKeys("shoes");
		Thread.sleep(2000);
		
		List<WebElement> lw=driver.findElements(By.xpath(""));
		
		driver.quit();
		

	}


}
