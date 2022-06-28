package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	public static String xl( int row,int cell,String data) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file=new FileInputStream("E:\\newone\\data.xlsx");
		
		String a=WorkbookFactory.create(file).getSheet(data).getRow(row).getCell(cell).getStringCellValue();
		return a;
	}
	}
