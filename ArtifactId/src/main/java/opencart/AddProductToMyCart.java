package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddProductToMyCart extends OpencartURL
{
   public void addToCart() throws Exception
   {
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("HomePage"))).click();
	   System.out.println("Back to Home page");
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 400)");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("AddToCardButton"))).click();
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 800)");
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("RadioButton"))).click();
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Checkbox"))).click();
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Text"))).clear();;
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Text"))).sendKeys("Hello This is Text Field");;
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Select"))).click();
	   
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("Textarea"))).sendKeys("Hello I am Text area");
	   
//	   Thread.sleep(1000);
//	   driver.findElement(By.xpath(pro.getProperty("FileUpload"))).sendKeys("D:\\ADIL(My-Folder)\\adil songs\\adil\\kids\\11.png");
	   
	   WebElement element = driver.findElement(By.xpath(pro.getProperty("FileUpload")));
	   jse.executeScript("arguments[0].value='D:\\ADIL(My-Folder)\\adil songs\\adil\\kids\\11.png';", element);
	   
//	   ----------------------- Handling Alert ----------------------------------
//	   String exp_Result = "Your file was successfully uploaded!";
//	   String act_Result = driver.switchTo().alert().getText();
//	   
//	   if(exp_Result.equalsIgnoreCase(act_Result))
//	   {
//		   Thread.sleep(3000);
//		   driver.switchTo().alert().accept();
//	   }
//	   --------------------------------------------------------------------------
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , 800)");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("SelectDate"))).clear();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("SelectDate"))).sendKeys(pro.getProperty("SelectDateValue"));
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pro.getProperty("SelectTime"))).clear();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(pro.getProperty("SelectTime"))).sendKeys(pro.getProperty("SelectTimeValue"));
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(pro.getProperty("AddToCartButton"))).click();
	   
	   Thread.sleep(3000);
	   jse.executeScript("window.scrollBy(0 , -800)");
	   
	   
   }
}