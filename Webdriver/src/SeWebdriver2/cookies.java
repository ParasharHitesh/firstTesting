package SeWebdriver2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cookies {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie cookie:cookies)       {
			System.out.println(cookie.getName()+" "+cookie.getValue());
			}
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		Cookie cookieobj=new Cookie("MyCookie","1234567");
		driver.manage().addCookie(cookieobj);
		
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie cookie:cookies)       {
			System.out.println(cookie.getName()+" "+cookie.getValue());
			}
		
		driver.manage().deleteCookie(cookieobj);
		
		driver.manage().deleteAllCookies();
		
		cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		
		
		
		
		

	}

}
