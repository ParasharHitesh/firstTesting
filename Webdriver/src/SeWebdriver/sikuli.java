package SeWebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
WebDriver driver=  new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");
WebElement ac =driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));	
ac.sendKeys("E:\\hits.JPG");


//driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();           NOT WORKING
/*String imagesFilepath="E:\\";
String inputFilepath="E:\\";
Screen s=new Screen();

Pattern fileInputTextbox=new Pattern(imagesFilepath+"Textbox.PNG");
Pattern openbutton=new Pattern(imagesFilepath+"Openbtn.PNG");

Thread.sleep(5000);


s.type(fileInputTextbox,inputFilepath+"hits.JPG");
s.click(openbutton);*/


		

	}

}
