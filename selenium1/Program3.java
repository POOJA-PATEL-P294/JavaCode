package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*--3)Launch the google page search for India and click using name Locator*/
public class Program3 
{

	public static void main(String[] args)
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://google.com");
		cd.manage().window().maximize();
		cd.findElement(By.name("q")).sendKeys("India");
		cd.findElement(By.name("btnk")).click();
		cd.close();	

	}

}
