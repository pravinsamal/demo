package demo1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class demo4 {

public static void main(String[] args) throws IOException {
	 WebDriver driver=openbrowser.openbrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	 
//	 WebElement cl=driver.findElement(By.xpath("(//input[@name=\"webform\"])[1]"));
//	 cl.click();
//	 System.out.println(cl.isSelected());
//	 
//	 WebElement ch=driver.findElement(By.xpath("//input[@value=\"checkbox1\"]"));
//	 ch.click();
//	 System.out.println(ch.isEnabled());
	 
	 WebElement sel=driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[2]"));
	 
	 WebElement sel1=driver.findElement(By.xpath("(//select[@class=\"col-lg-3\"])[1]"));
	 
//	 Select a=new Select(sel);
//	 a.selectByIndex(1);
	 
	 Select b=new Select(sel1);
//	b.selectByIndex(1);

	 
//	 b.selectByValue("Google");
	 b.selectByVisibleText("Google");
	 
	 ss.takess(driver, "samal");
	 
	 
	 
	 }

}
