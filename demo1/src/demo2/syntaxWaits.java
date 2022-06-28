package demo2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syntaxWaits {
	public static void main(String[] args) {
		WebDriver driver=openbrowser.browser("https://nxtgenaiacademy.com/alertandpopup/");

		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		
		
		WebElement a1=driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOf(a1));
	}

}
