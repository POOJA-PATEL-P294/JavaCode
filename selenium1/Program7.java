package selenium1;
//--7)Launch the google page and click on the Gmail icon

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		WebElement g=driver.findElement(By.linkText("Gmail"));
		Thread.sleep(2000);
		g.click();
		driver.quit();

	}

}
