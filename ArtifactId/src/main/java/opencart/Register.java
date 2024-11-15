package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register extends OpencartURL
{
   public void register() throws Exception
   {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Register1"))).click();
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("Register2"))).click();
	   
	   jse = (JavascriptExecutor)driver;
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Fname"))).sendKeys(pro.getProperty("FnameValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Lname"))).sendKeys(pro.getProperty("LnameValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Telephone"))).sendKeys(pro.getProperty("TelephoneValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("CPassword"))).sendKeys(pro.getProperty("CPasswordValue"));
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Subscribe"))).click();
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("PrivacyPolicy"))).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("ContinueButton"))).click();
   }
}
