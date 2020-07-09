package SeWebdriver2;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hashm {
	
	static HashMap <String, String> logindata()
	{ 	
		HashMap hm=new HashMap <String,String>(); 
		hm.put("x",	"mercury@mercury");	
		hm.put("y",	"mercury1@mercury1");
		hm.put("z",	"mercury2@mercury2");
		return hm;
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		String credentials=logindata().get("y");
		String arr[]=credentials.split("@");
		driver.findElement(By.name("userName")).sendKeys(arr[0]);
		driver.findElement(By.name("password")).sendKeys(arr[1]);
		driver.findElement(By.name("login")).click();	
		
		
		
		
		
		
		
		
		
	}

}
