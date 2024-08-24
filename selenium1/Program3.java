package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*--3)Launch the google page search for India and click using name Locator*/
public class Program3 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://google.com");
		cd.manage().window().maximize();
		
		System.out.println(cd.getWindowHandles());
		System.out.println(cd.getWindowHandle());
		System.out.println(cd.getTitle());
		
		cd.findElement(By.name("q")).sendKeys("India");
		cd.findElement(By.id("APjFqb")).click();
		Thread.sleep(5000);
		cd.quit();	

	}

}
