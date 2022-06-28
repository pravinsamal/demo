package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	public static void main(String[] args) {
		WebDriver driver=openbrowser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		
		driver.switchTo().frame(f1);
		
		WebElement source=driver.findElement(By.xpath("(//li[contains(@class,\"ui-widget-content ui-\")])[1]"));
		WebElement dest=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest);
		act.perform();
	}

}
