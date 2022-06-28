package demo2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectmETHODS {
	public static void main(String[] args) throws IOException {
		WebDriver driver=openbrowser.browser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement s1=driver.findElement(By.xpath("//select[@id=\"first\"]"));
		
		Select sc=new Select(s1);
		
		sc.selectByIndex(2);
		sc.selectByValue("Google");
		sc.selectByVisibleText("Yahoo");
//		screenshot.ss(driver);
		screenshot.ss(driver, "demo");
		
	}

}
