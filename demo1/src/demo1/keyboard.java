package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=openbrowser.openbrowser("https://demoqa.com/text-box");
		Actions act=new Actions(driver);
		WebElement name=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		name.sendKeys("pravin");
		
	act.sendKeys(Keys.TAB);
	act.perform();
	act.sendKeys("samal");
	act.perform();
	act.keyUp(Keys.CONTROL);
	act.sendKeys("a");
	act.keyDown(Keys.CONTROL);
	act.build().perform();
	Thread.sleep(1500);
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyDown(Keys.CONTROL);
	act.build().perform();
	
	act.sendKeys(Keys.TAB);
	
	act.keyUp(Keys.CONTROL);
	act.sendKeys("v");
	act.keyDown(Keys.CONTROL);
	act.build().perform();
	}

}
