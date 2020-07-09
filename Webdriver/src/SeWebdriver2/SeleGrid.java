package SeWebdriver2;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleGrid {

	void setup()   {
		
	String nodeURL="http://192.168.43.244:31349/wd/hub";
	
	DesiredCapabilities cap=DesiredCapabilities.chrome();	
			cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WIN10);
	
	WebDriver driver=new RemoteWebDriver(new URL(nodeURL),cap);

	}	
	void login() {
		
		// CAN LOGIN TO TOUR WEB PAGE 

}
}