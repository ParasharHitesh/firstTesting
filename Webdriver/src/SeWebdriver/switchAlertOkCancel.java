package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchAlertOkCancel {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.id("CancelTab")).click();
	
		String EXPOK="You pressed Ok";
		
		
		driver.switchTo().alert().accept();
	String ACTOK=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
	if(EXPOK.equals(ACTOK)==true)  {
		System.out.println("COrrect");
	}
	driver.findElement(By.id("CancelTab")).click();
	String EXPCANCEL="You Pressed Cancel";
	driver.switchTo().alert().dismiss();
	
	String ACTCANCEL=driver.findElement(By.cssSelector("p")).getText();
	if(EXPCANCEL.equals(ACTCANCEL)==true) {
		System.out.println("COrrect");   }
		else {
			System.out.println("NOTCOrrect");  }
			
		}
		
	
	//  driver.switchTo().alert().sendKeys("text");

	}


