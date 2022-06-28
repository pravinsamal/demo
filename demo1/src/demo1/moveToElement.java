package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=openbrowser.openbrowser("https://www.amazon.in/");
		WebElement s1=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(s1);
		act.perform();
		Thread.sleep(1500);
		WebElement order=driver.findElement(By.xpath("//span[text()=\"Your Orders\"]"));

		order.click();
	}

}
