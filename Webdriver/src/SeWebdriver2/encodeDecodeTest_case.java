package SeWebdriver2;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class encodeDecodeTest_case {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodeString("dGVzdDEyMw=="));
		

	}

	private static CharSequence decodeString(String password) {
		byte[] decodeString=Base64.decodeBase64(password);
		return (new String(decodeString));
	}

}
