package SeWebdriver;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class sortdropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement element= driver.findElement(By.id("animals"));
		Select se=new Select(element);
		//se.selectByIndex(2);
		//se.selectByValue("Radio2");
		//se.selectByVisibleText("cat");
		//System.out.println(se.getOptions().size());
		
		ArrayList originalList= new ArrayList();
		ArrayList tempList= new ArrayList();
		
		ArrayList <WebElement>options=(ArrayList<WebElement>) se.getOptions();
		
		for(WebElement e:options)   {
			
			((ArrayList) originalList).add(e.getText());
			((ArrayList) tempList).add(e.getText());
			
		}
		System.out.println(originalList);
		
		
		System.out.println(tempList);
		
		Collections.sort(tempList);
		System.out.println(tempList);
		
		if(originalList==tempList) {
			System.out.println("Dropdown is Sorted");
		}
		else {
			System.out.println("Dropdown is not Sorted");
		}
		
		
		
		
	}

}
