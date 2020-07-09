package SeWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		Actions act=new Actions(driver);
		
		WebElement admin=driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermg=driver.findElement(By.id("menu_admin_UserManagement"));  //PROBLEM
		WebElement user=driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		act.moveToElement(admin).build().perform();
		act.moveToElement(usermg).build().perform();
		act.moveToElement(user).click().build().perform();
		
	//SHORTCUT	//act.moveToElement(admin).moveToElement(usermg).moveToElement(user).click().build().perform();
		
		
		int rc=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();
		
	 int statuscount=0;
	 for(int i=1;i<=rc;i++)       {
		 
		 String status= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr["+i+"]/td[5]")).getText();
	
	      if(status.equals("Enabled")) {
	    	  statuscount=statuscount+1;
	      }
	 }
	 
	 System.out.println("ENABLED "+ statuscount);
	 


	}

}
