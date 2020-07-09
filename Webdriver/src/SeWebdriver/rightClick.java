package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		act.contextClick(button).build().perform();     //RIGHT CLICK
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();	
		

	}

}
