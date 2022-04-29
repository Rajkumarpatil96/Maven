package Utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
public static String getdatafromExcel(int row,int column) throws IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\ZerodhaCrediatial1.xlsx");
	Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = mysheet.getRow(row).getCell(column).getStringCellValue();
	return value;
	
	
	
}


}


