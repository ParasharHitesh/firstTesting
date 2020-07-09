package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class calender {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fs11.formsite.com/f8zjtE/cvmsy6tasv/index.html?1592927495868");
		
		driver.findElement(By.xpath("/html/body/form/div[2]/div[17]/span")).click();
		Select y=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/select")));
          y.selectByVisibleText("2020");
          
          for(int i=6;i>=1;i--)   {
        	  
        	  driver.findElement(By.xpath("/html/body/div[1]/div/a[2]/span")).click();
   // driver.findElement(By.xpath("/html/body/div[1]/div/a[1]/span")).click();  BACK DATE ARROW
        	 String t= driver.findElement(By.xpath("/html/body/div[1]/div/div/span")).getText();
              if(t.equals("September"))   {
            	 driver.findElement(By.linkText("20")).click();
            	  break; }
              }
          
          }
	}
	

