package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*--7)Launch an application where right click is diabled and register using dummy data*/
public class SBI_Right_Click_Diasble
{
public static void main(String[] args) throws InterruptedException
 {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	
	WebElement c=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	c.click();
	
	WebElement u=driver.findElement(By.name("userName"));
	u.sendKeys("pooja.patel");
	
	WebElement p=driver.findElement(By.name("password"));
	p.sendKeys("pooja-1357");
	
	WebElement cp=driver.findElement(By.name("loginCaptchaValue"));
	cp.sendKeys("byy2d");
	cp.click();

	Thread.sleep(5000);
	driver.quit();
 }

}
