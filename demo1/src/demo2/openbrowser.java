package demo2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {
	public static WebDriver browser(String url) {
	System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
//	driver.navigate().refresh();
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().to("");
	
	driver.manage().window().maximize();
	
//	Dimension d=new Dimension(400,600);
//	driver.manage().window().setSize(d);
//	
//	Point p=new Point(10,0);
//driver.manage().window().setPosition(p);

return driver;
	
	}

}
