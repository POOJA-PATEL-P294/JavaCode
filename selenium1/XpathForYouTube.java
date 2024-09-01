package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForYouTube 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement e=driver.findElement(By.xpath("//input[@id='search']"));
		e.sendKeys("grotechminds");
		e.sendKeys(Keys.ENTER);
		
		WebElement q=driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']"));
		q.click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
