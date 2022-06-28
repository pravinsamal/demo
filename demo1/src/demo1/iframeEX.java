package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class iframeEX {
	
	public static void main(String[] args) {
		

WebDriver driver=	openbrowser.openbrowser("http://demo.automationtesting.in/Frames.html");

WebElement s=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));

driver.switchTo().frame(s);                                  ///by webElement
//driver.switchTo().frame("singleframe");   ///By ID


WebElement a=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
a.sendKeys("pravin");



//WebElement mul=driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
//mul.click();
//driver.switchTo().frame(0);
//driver.switchTo().frame(1);
//
//WebElement i2=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
//i2.sendKeys("samal");
//	}
}
}
