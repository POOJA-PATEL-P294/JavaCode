package selenium1;
/*--18)Launch a google type Bengaluru and select any auto suggetion*/

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestF_Google
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement g=driver.findElement(By.name("q"));
		g.sendKeys("Bengaluru");
		Thread.sleep(1000);
		
		List<WebElement> g1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int c=g1.size();
		System.out.println(c);
		g1.get(c-10).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
