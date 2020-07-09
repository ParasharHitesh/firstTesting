package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTableTestCase {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		
		int r=driver.findElements(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div")).size();
		
   System.out.println(r);
   int c=driver.findElements(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[3]/div/div")).size();
   System.out.println(c);
   
   for(int i=1;i<=10;i++)  {
	   
	   for(int j=1;j<=5;j++) {
		  
	System.out.print(driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div["+i+"]/div/div["+j+"]/div")).getText());
		   
	   }
	   
   }
   //System.out.println();
   
	}

}
