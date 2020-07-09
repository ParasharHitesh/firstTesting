package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class bittu {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\lenovo\\Downloads\\geckodriver.exe");

		
		WebDriver sp =  new FirefoxDriver();
		
		
		
		
		sp.get("http://newtours.demoaut.com/");
		
		sp.manage().window().maximize();
		
		
		 WebElement username = sp.findElement(By.name("userName"));
		 username.sendKeys("mercury");
		 
		 
		
		sp.findElement(By.name("password")).sendKeys("mercury");
		
		sp.findElement(By.name("login")).click();
		
		String exp_title="Find a Flight: Mercury Tours:";
		
		//String exp_title="Welcome: Mercury Tours";
		String act_title=sp.getTitle();
		
		System.out.println(act_title);
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("Pass");	
		}
		else
		{
			System.out.println("Fail");
		}
			//sp.close();
	}
		
		
	}
		
		

