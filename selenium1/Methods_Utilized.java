package selenium1;
/*2)Utilize the methods GetTiltle(), quit(), close(), Getwindowhandles(), manage(), Getwindowhandle(),
maximize(), minimize() on the launched browsers.*/

import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Utilized
{

	public static void main(String[] args) 
	{
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://google.com");
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
		System.out.println(cd.getWindowHandle());
		System.out.println(cd.getWindowHandles());
		cd.manage().window().minimize();
		
		//cd.quit();
		cd.close();
	}

}
