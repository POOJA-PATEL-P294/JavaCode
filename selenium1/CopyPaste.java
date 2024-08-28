package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*-12)Login to grotech minds application and on the registration page, provide username and copy paste the same in the last name field*/
public class CopyPaste 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement f=driver.findElement(By.name("fname"));
		f.sendKeys("poojapatel");
		f.sendKeys(Keys.CONTROL + "a");
		f.sendKeys(Keys.CONTROL + "c");
		
		WebElement l=driver.findElement(By.id("lname"));
		l.sendKeys(Keys.CONTROL + "V");
		
		
		WebElement e=driver.findElement(By.id("email"));
		e.sendKeys(Keys.CONTROL + "v");
		WebElement p=driver.findElement(By.name("password"));
		p.sendKeys(Keys.CONTROL + "v");
	
		WebElement m=driver.findElement(By.name("gender"));
		m.click();
		WebElement q=driver.findElement(By.id("Female"));
		q.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
