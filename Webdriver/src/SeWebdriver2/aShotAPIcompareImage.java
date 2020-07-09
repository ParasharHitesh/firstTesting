package SeWebdriver2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class aShotAPIcompareImage {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://opensource-demo.orangehrmlive.com/");
	
	BufferedImage expimg=ImageIO.read(new File("E://screenshot/orange.png"));
	
	WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
	Screenshot logoimage=new AShot().takeScreenshot(driver,logo);
	
	BufferedImage actimg=logoimage.getImage();
	
	ImageDiffer imgdiff	=new ImageDiffer();
	ImageDiff diff=imgdiff.makeDiff(expimg,actimg);
	
	if(diff.hasDiff()==true)   {
		System.out.println("Image are not same ");
	}
	else {
		System.out.println("Image are same");
	}
	
	
	
	
	
	
	}

}
