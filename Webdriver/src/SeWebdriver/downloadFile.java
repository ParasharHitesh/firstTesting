package SeWebdriver;



import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class downloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile profile=new FirefoxProfile();
			
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain"); //SET MIME
		profile.setPreference("browser.download.manager.showWhenStarting",false);

		// DOWNLOAD FILE ON DESIERED LOCATION
		profile.setPreference("browser.download.dir","E:\\");
		profile.setPreference("browser.download.folderList", 2);
		//profile.setPreference("pdfjs.disabled",true);  ONLY FOR PDF
		
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id=\"createTxt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		
		Thread.sleep(5000);
		if(isFileExist("E:\\info.txt"))   {
			System.out.println("File Exists");
		}
		else   {
			System.out.println("File not Exists");   }
			
		}
		static boolean isFileExist(String path)	    { 
			File f=new File(path);
			if(f.exists()) {
				return true;	
			}
			else {
				return false;
			}
		
			
			
		}
		
		
		
		
	}


