package SeWebdriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createexcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file=new FileOutputStream("C:\\Users\\lenovo\\Desktop\\FileByJava.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFSheet sheet1=workbook.createSheet("Data1");
		
		for(int i=0;i<=5;i++)   {
			
			XSSFRow row=sheet.createRow(i);
			XSSFRow row1=sheet1.createRow(i);
			
			for(int j=0;j<=3;j++)    {
				
				row.createCell(j).setCellValue("bittu");
				row1.createCell(j).setCellValue("hitesh");
			}
		}
         
		workbook.write(file);
		file.close();
	}

}
