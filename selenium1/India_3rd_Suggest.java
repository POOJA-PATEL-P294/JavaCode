package selenium1;
/*--8)Launch google search page, identify the search tab and search with the text "India" and select the third result from the Auto Suggestion and click enter
 * "India" and select the third result from the Auto Suggestion and click enter*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India_3rd_Suggest
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys(Keys.ARROW_DOWN +""+ Keys.ARROW_DOWN + Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
