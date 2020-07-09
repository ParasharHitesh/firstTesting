package SeWebdriver2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javaScriptExecutor {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		WebElement joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a/span"));
		
		//JavaScriptUtil.flash(joinfree,driver);	  
		
		//System.out.println("oo");
		
		/*JavaScriptUtil.drawBorder(joinfree,driver);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("E://screenshot/twoplugs.png");
		FileUtils.copyFile(src,trg);	
		
	String title=JavaScriptUtil.getTitleByJS(driver);
	System.out.println(title);*/
		
		//WebElement loginbtn	=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
       //  JavaScriptUtil.clickElementByJS(loginbtn,driver);
      //	  JavaScriptUtil.generateAlert(driver,"You clicked on login button....");
		
		
		//JavaScriptUtil.refreshBrowserByJS(driver);
		
		//WebElement image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));
		//JavaScriptUtil.scrollIntoView(image,driver);
		JavaScriptUtil.scrollPageDown(driver);
		
		
	}

}
