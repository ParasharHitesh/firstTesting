package SeWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class excelCalc {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

	FileInputStream file=new FileInputStream("C:\\Users\\lenovo\\Desktop\\Selenium_SI.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("sheet1");
	
	int tp=sheet.getLastRowNum();                            
	
	for(int i=1;i<=tp;i++) {
		
		XSSFRow row=sheet.getRow(i);	
		
	//	XSSFCell principlecell=row.getCell(0);
		//int princ=(int)principlecell.getNumericCellValue();
		
		//XSSFCell roi=row.getCell(1);
		//int rateofinterest=(int)roi.getNumericCellValue();
		
		//XSSFCell period=row.getCell(2);
		//int per=(int)period.getNumericCellValue();	
		
		//XSSFCell Frequency=row.getCell(3);
		//String frq=Frequency.getStringCellValue();
		
		//XSSFCell MaturityValue=row.getCell(4);
		//int Exp_mvalue=(int)MaturityValue.getNumericCellValue();
		
		
		
		
		
		int princ=(int)row.getCell(0).getNumericCellValue();               // TYPE CASTING STATEMENTS
		int rateofinterest=(int)row.getCell(1).getNumericCellValue();
		int per=(int)row.getCell(2).getNumericCellValue();	
		String frq=(String)row.getCell(3).getStringCellValue();
		int Exp_mvalue=(int)row.getCell(4).getNumericCellValue();
		
		//WebElement var = driver.findElement(By.xpath("//input[contains(@name,'principal')]"));    // VERY IMP 
		//var.sendKeys(String.valueOf(princ));
		
		driver.findElement(By.id("principal")).sendKeys(String.valueOf(princ));
		driver.findElement(By.id("interest")).sendKeys(String.valueOf(rateofinterest));
		driver.findElement(By.id("tenure")).sendKeys(String.valueOf(per));
		
		Select pc=new Select(driver.findElement(By.id("tenurePeriod")));
		pc.selectByVisibleText("year(s)");
		
		Select frequency=new Select(driver.findElement(By.id("frequency")));
		frequency.selectByVisibleText(frq);
		
		driver.findElement(By.xpath("//img[contains(@src,'calcutate.gif')]")).click();
		
		String actual_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();
		
		if((Double.parseDouble(actual_mvalue))==Exp_mvalue)
		{
			System.out.println("Test Passed");	
		}
		else  {
			System.out.println("Test Failed");
		}
		
		driver.findElement(By.xpath("//img[contains(@class,'PL5')]")).click();		
	}
	
	driver.close();
	driver.quit();
		
		
	}

}
