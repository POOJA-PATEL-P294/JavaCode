package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*-20)Launch the Amazon application and search for mobile phones and select the 4th drop down item from the dropdown*/
public class AutoSuggest_Amazon
{

	public static void main(String[] args)
	{
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
		WebElement w=d.findElement(By.id("searchDropdownBox"));
		Select s=new Select(w);
		s.selectByVisibleText("Books");
		
		WebElement w1=d.findElement(By.id("twotabsearchtextbox"));
		w1.sendKeys("minds"+ Keys.ENTER);
		d.quit();
	}

}
