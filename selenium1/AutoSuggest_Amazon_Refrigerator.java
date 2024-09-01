package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*-21)Launch the Amazon application and search for a fridge and select the 4th from the Auto Suggest-*/
public class AutoSuggest_Amazon_Refrigerator
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement g=driver.findElement(By.id("twotabsearchtextbox"));
		g.sendKeys("Refrigerator");
		Thread.sleep(2000);
		
		List<WebElement> g1=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int c=g1.size();
		System.out.println(c);
		
		g1.get(c-7).click();
		
		
		driver.quit();
		
	}
}
