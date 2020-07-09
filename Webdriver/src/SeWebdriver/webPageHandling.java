package SeWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webPageHandling {

	public static void main(String[] args) {
		
		WebDriver driver	=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		 
		 
		 
		 Set <String> s= driver.getWindowHandles();     // s takes keys and id of all windows
		 
		for(String i:s) {
			//System.out.println(i);
			String t= driver.switchTo().window(i).getTitle();
	//System.out.println(t);
			if(t.contains("Frames & windows"))  {           //PROBLEM WITH Sakinalium | Home
				System.out.println("present");
				driver.close();
				
			}
			                                                  // Frames & windows
			}
		

	}

}
