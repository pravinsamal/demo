package demo2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xl {
	public static String ex(String name,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\ALL jar\\data.xlsx");
		
	String value=	WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
	
		return value;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\ALL jar\\browser server file exe\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		WebElement user=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		String q=xl.ex("userdata", 0, 1);
	
//	String q=s.getdata(0, 1, "Credentials");
		
		user.sendKeys(q);
	}

}
