package demo1;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {
//	public static void screen(WebDriver driver) throws IOException {
//		 
//		
//		
//		 File source=(( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 
//		 File destination=new File("E:\\ALL jar\\ScreenShot\\amazon.jpg");
//		 
//		 FileHandler.copy(source, destination);
//		
//		
//	}
	public static void takess(WebDriver driver,String name) throws IOException {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("__ddMMyyyy_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String date=dtf.format(now);	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination =new File("\"E:\\ALL jar\\ScreenShot\\"+name+date+"jpg");
	
	FileHandler.copy(source, destination);
	
}

}
