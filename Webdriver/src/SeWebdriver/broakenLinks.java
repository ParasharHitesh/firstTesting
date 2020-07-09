package SeWebdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import io.netty.handler.codec.http2.Http2Connection;

public class broakenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);   // IMPLICIT WAIT 10SEC
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);	
		
		ArrayList <WebElement>links=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)    {
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
				URL link=new URL(url);
				HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
				
				Thread.sleep(2000);
				((URLConnection) httpconn).connect();
				int rescode	=httpconn.getResponseCode();
				if (rescode>=400)    {
					System.out.println(url+" "+ "is broaken link");
				}
				else {
					System.out.println(url+" "+ "is valid link");
					
				}
				
		}
		

	}

}
