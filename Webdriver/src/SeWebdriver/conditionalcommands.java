package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conditionalcommands {

	public static void main(String[] args) {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		
		if(email.isDisplayed() && email.isEnabled()) {
			
			email.sendKeys("BITTU");
		}
		
          if(pass.isDisplayed() && pass.isEnabled()) {
			
			pass.sendKeys("SHARMA");    }
          
          System.out.println(driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]")).isSelected());
          
          System.out.println(driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'7')]")).isSelected());
		
          if(driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]")).isSelected()==false);  {
        	  
        	  driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]")).click();
          }

	}//System.out.println(driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]")).isSelected());
 // if false then -- driver.findElement(By.xpath("//input[@type='radio'][contains(@id,'6')]")).click();
}
