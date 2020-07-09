package SeWebdriver2;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class aShotAPI {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/");	
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
			Screenshot logoimage=new AShot().takeScreenshot(driver,logo);
			ImageIO.write(logoimage.getImage(),"png",new File("E://screenshot/orange.png"));
			
			File f=new File("E://screenshot/");
			if (f.exists())  {
				System.out.println("Image file captured");
			}
			else {
				System.out.println("Image not captured");
			}

	}




	}


