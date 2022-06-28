package demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alartpopup {
	public static void main(String[] args) {
		WebDriver driver=openbrowser.openbrowser("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement  al1=driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
//		al1.click();
//	Alert a=	driver.switchTo().alert();
//		a.accept();
		
		WebElement al2=driver.findElement(By.xpath("//button[text()=\"Confirm Alert Box\"]"));
		al2.click(); 
		Alert b=driver.switchTo().alert();
		b.dismiss();
	}

}
