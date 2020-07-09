package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath(" /html/body/div[1]/span"));
		
		
		Actions act=new Actions(driver);
		act.moveToElement(slider).dragAndDropBy(slider,300,0).build().perform();

	}

}
