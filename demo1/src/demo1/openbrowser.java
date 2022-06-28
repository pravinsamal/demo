package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static WebDriver openbrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	
	}

}
