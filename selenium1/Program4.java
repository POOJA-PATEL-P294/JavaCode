package selenium1;
/*-4)Launch the google page search for India and Enter using Enter key using name locator*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program4
{

	public static void main(String[] args)
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://google.com");
		cd.findElement(By.name("q")).sendKeys("India");
		cd.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

}
