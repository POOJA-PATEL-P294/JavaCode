package selenium1;
/*--19)Launch the SBI website where right click is disabled and click on continue to login button using
 *  LinkText or PartialLinkText and add UserName and Password*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LP_LinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement c=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		c.click();
		
		WebElement u=driver.findElement(By.linkText("username"));
		u.sendKeys("poojapate");
		
		WebElement p=driver.findElement(By.linkText("password"));
		p.sendKeys("pooja-1357");
		
		WebElement cp=driver.findElement(By.linkText("loginCaptchaValue"));
		cp.sendKeys("byy2d");
		cp.click();

		Thread.sleep(4000);
		driver.quit();

	}

}
