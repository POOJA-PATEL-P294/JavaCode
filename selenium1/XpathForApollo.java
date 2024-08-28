package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*-16)Launch the apollopharmacy page, search for a medicine "PMC" and select the first result*/
public class XpathForApollo 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		
		WebElement e1=	driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		
		e1.click();
		
		
		WebElement w=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		w.sendKeys("PCM" + Keys.ENTER);

		Thread.sleep(4000);
		driver.quit();
	}

}
