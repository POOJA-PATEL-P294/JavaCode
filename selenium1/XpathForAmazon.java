package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch the amazon application and search for Shoes and select the first result-*/
public class XpathForAmazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e.sendKeys("shoes" + Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
