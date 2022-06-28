package demo2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframes {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=openbrowser.browser("http://demo.automationtesting.in/Frames.html");
	
	WebElement f=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
	driver.switchTo().frame(f);

	
	
	
	WebElement te=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	String n=	xl.ex("data", 3,1);
	te.sendKeys(n);
//	driver.switchTo().defaultContent();
	
//	WebElement c=driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
//	c.click();
}
}
