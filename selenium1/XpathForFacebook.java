package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*--13)Login to facebook using relative X- path--*/
public class XpathForFacebook 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement e=driver.findElement(By.xpath("//input[@id='email']"));
		e.sendKeys("pooja.patelp@gmail.com");
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='pass']"));
		e1.sendKeys("7829196361" + Keys.ENTER);
		e1.click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
