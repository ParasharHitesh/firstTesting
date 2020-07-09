package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;


public class hitesh {

	public static void main(String[] args) {
		
	//	ChromeOptions options=new ChromeOptions();   HEADLESS  and FOR HtmlUnitDriver no need of Options
	//	options.setHeadless(true);
		
		
		WebDriver op =  new ChromeDriver();  
		
		
		// WebDriver op =  new ChromeDriver(options);   FOR HEADLESS
		
		
		
		
		op .get("http://newtours.demoaut.com/");
		
		WebElement username= op.findElement(By.name("userName")); 
		username.sendKeys("mercury");
		
		op.findElement(By.name("password")).sendKeys("mercury");
		
		op.findElement(By.name("login")).click();
		
		System.out.println(op.getTitle());
		
		 
		

	}

}
