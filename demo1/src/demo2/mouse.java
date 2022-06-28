package demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouse {
	public static void main(String[] args) {
	WebDriver driver=	openbrowser.browser("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement c=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	
	Actions act=new Actions(driver);
	act.contextClick(c);
	act.perform();
	}

}
