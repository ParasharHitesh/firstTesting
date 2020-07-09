package SeWebdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class exceldataregister {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		FileInputStream file=new FileInputStream("C:\\Users\\lenovo\\Desktop\\Excel_Regis1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int row=sheet.getLastRowNum();
		System.out.println(row);
		
		for(int i=1;i<=row;i++)  {
			
			XSSFRow ac=sheet.getRow(i);
			
			String First_Name=ac.getCell(0).getStringCellValue();
			String Last_Name=ac.getCell(1).getStringCellValue();
			int Phone=(int) ac.getCell(2).getNumericCellValue();
			String Email=ac.getCell(3).getStringCellValue();
			String Address=ac.getCell(4).getStringCellValue();
			String City=ac.getCell(5).getStringCellValue();
			String State=ac.getCell(6).getStringCellValue();
			int Postal_Code=(int) ac.getCell(7).getNumericCellValue();
			String Country=ac.getCell(8).getStringCellValue();
			String User_Name=ac.getCell(9).getStringCellValue();
			String Password=ac.getCell(10).getStringCellValue();
			
			driver.findElement(By.linkText("REGISTER")).click();
			
			driver.findElement(By.name("firstName")).sendKeys(First_Name);
			driver.findElement(By.name("lastName")).sendKeys(Last_Name);
			driver.findElement(By.name("phone")).sendKeys(String.valueOf(Phone));
			driver.findElement(By.name("userName")).sendKeys(Email);
			driver.findElement(By.name("address1")).sendKeys(Address);
			driver.findElement(By.name("city")).sendKeys(City);
			driver.findElement(By.name("state")).sendKeys(State);
			driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(Postal_Code));
			
			Select	dropcountry=new Select(driver.findElement(By.name("country")));
			dropcountry.selectByVisibleText(Country);
			
			driver.findElement(By.name("email")).sendKeys(User_Name);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.name("confirmPassword")).sendKeys(Password);
			
			driver.findElement(By.name("register")).click();	
			
			if(driver.getPageSource().contains("Thank you for registering"))   {
				
				System.out.println("Completed for "+ i +" record");
			}
			else {
				System.out.println("Failed for "+ i +" record");
			}
		}
		System.out.println("Task Completed");
		driver.close();
		driver.quit();
		
		file.close();
           
	}

}
