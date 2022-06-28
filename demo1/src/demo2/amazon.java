package demo2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.excel;

public class amazon {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=openbrowser.browser("https://www.amazon.in/");
		
		
		
		
//	String va=	xl.ex("data", 3, 1);
		WebElement s=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		String q=excel.xl(0, 1, "data");
		s.sendKeys(q);
		
		
	}

}
