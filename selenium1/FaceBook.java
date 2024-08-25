package selenium1;
//-5)Launch the facebook application and log in to the page using name locator
import org.openqa.selenium.By;
//--5)Launch the facebook application and log in to the page using name locator
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("raginigowda2486@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("78965463");
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		
		driver.quit();
	
	}

}
