package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*--10)Launch the HTML application (Learning HTML) and select all the values (Except the dropdown)*/
public class HTML_Learning 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/pooja/Downloads/learningHTML1.html");
		
		WebElement u=driver.findElement(By.xpath("(/html/body/input)[1]"));
		u.sendKeys("PoojaPatelP");
		
		WebElement h=driver.findElement(By.xpath("(/html/body/input)[2]"));
		h.sendKeys("Patel");
		
		WebElement p=driver.findElement(By.xpath("(/html/body/input)[3]"));
		p.sendKeys("Patel#1245");
		
		WebElement f=driver.findElement(By.xpath("(/html/body/form[1]/input)[1]"));
		f.sendKeys("Pooja");
		
		
		WebElement s=driver.findElement(By.xpath("(/html/body/form[1]/input)[3]"));
		s.click();
	
		
		WebElement b=driver.findElement(By.xpath("(/html/body/form[2]/input)[1]"));
		b.click();
		WebElement g=driver.findElement(By.xpath("(/html/body/form[2]/input)[2]"));
		g.click();
		WebElement q=driver.findElement(By.xpath("(/html/body/form[2]/input)[3]"));
		q.click();
		WebElement s1=driver.findElement(By.xpath("(/html/body/form[2]/input)[4]"));
		s1.click();
		
		WebElement m=driver.findElement(By.xpath("(html/body/input)[4]"));
		m.click();
		WebElement f1=driver.findElement(By.xpath("(html/body/input)[5]]"));
		f1.click();
		WebElement bg=driver.findElement(By.xpath("(html/body/input)[6]"));
		bg.click();
		Thread.sleep(3000);
		driver.quit();
		

	}

}
