package SeWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;

public class excel {

	

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Selenium_1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)  {
			
			XSSFRow hp=sheet.getRow(i);
			
			for(int j=0;j<colcount;j++)     {
				
			
			String value=hp.getCell(j).toString();  
			
			System.out.print(" " +value);                // FOR BETTER DISPLAY
			
			}
			System.out.println();
		}

	}

}
