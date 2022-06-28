
package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class rightclick {
	public static void main(String[] args) {
		
		WebDriver driver=openbrowser.openbrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right=driver.findElement(By.xpath("//span[contains(@class,\"context-menu\")]"));
		Actions act=new Actions(driver);
		act.contextClick(right);
		
		act.perform();
		
		WebElement pa=driver.findElement(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu-icon-pa\")]"));
		pa.click();
	}

}
