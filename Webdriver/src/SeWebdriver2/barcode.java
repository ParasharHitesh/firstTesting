package SeWebdriver2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class barcode {

	public static void main(String[] args) throws IOException, NotFoundException {
		
		WebDriver driver=new ChromeDriver();
		//https://www.barcodesinc.com/generator/index.php
		driver.get("http://qrcode.meetheed.com/qrcode_examples.php");
		String barCodeURL= driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/div[1]/div[1]/div[1]/img")).getAttribute("src");	
		
		System.out.println(barCodeURL);
		URL url=new URL(barCodeURL);
		BufferedImage buff=ImageIO.read(url);
		
		BufferedImage bufferedimage;
		LuminanceSource	luminancesource=new BufferedImageLuminanceSource(buff);
			BinaryBitmap binaryBitmap=	new BinaryBitmap(new HybridBinarizer(luminancesource));
			Result result=new MultiFormatReader().decode(binaryBitmap);
			System.out.println(result.getText());
	}
	
}
