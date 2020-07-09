package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		WebElement resize=driver.findElement(By.xpath(" //*[@id=\"resizable\"]"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize,800,900).build().perform();


	}

}
