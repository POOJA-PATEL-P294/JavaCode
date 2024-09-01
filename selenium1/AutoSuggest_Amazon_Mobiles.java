package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Launch the Amazon application and search for mobile phones and select the 4th drop down item from the dropdown---DONE---*/
public class AutoSuggest_Amazon_Mobiles
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		WebElement w1=d.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("mobiles");
		Thread.sleep(2000);
		
		List<WebElement> w=d.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		int c=w.size();
		System.out.println(c);
		
		w.get(c-6  ).click();
		
		Thread.sleep(1000);
		d.quit();
	}

}
