package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"dropContent\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		Actions act=new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		
		act.dragAndDrop(source,target).build().perform();

	}

}
