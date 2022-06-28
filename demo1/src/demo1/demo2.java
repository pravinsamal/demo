package demo1;


import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Dimension d=new Dimension(400,400);
		driver.manage().window().setSize(d);
		
	Point p=new Point(500,500);
	driver.manage().window().setPosition(p);
	
	WebElement gro=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	gro.click();
	System.out.println(gro.isSelected());
	
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File desgigation=new File("E:\\ALL jar\\ScreenShot\\amazon.png");
	FileHandler.copy(source, desgigation);
		
		driver.quit();
	}

}
