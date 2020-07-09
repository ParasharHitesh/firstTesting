package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getandbrowserCmand {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
          System.out.println(driver.getTitle());
          System.out.println(driver.getCurrentUrl());
          
          
		String text=driver.findElement(By.xpath("//b[contains(.,'Jun 20, 2020')]")).getText();
		
	       System.out.println(text);
	       
	       driver.close();
	       //driver.quit();               TO CLOSE ALL TABS
		
		

	

	
	
	}

}
