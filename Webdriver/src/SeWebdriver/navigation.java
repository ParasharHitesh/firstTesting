package SeWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
