package selenium1;
/*--17)Launch the Amazon page and click on the CustomerService--- */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Customer
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e=driver.findElement(By.xpath("//a[6][@class='nav-a']"));
		e.click();
		
		Thread.sleep(4000);
		driver.quit();
	}

}
