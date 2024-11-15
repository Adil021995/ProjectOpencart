package opencart;

import org.openqa.selenium.By;

public class BillingDetails extends OpencartURL
{
	public void billing_method() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("Checkout"))).click();
		
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0 , 400)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Fname"))).sendKeys(pro.getProperty("FnameValue"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Lname"))).sendKeys(pro.getProperty("LnameValue"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Company"))).sendKeys(pro.getProperty("CompanyValue"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Address1"))).sendKeys(pro.getProperty("Address1Value"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("Address2"))).sendKeys(pro.getProperty("Address2Value"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("City"))).sendKeys(pro.getProperty("CityValue"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("PinCode"))).sendKeys(pro.getProperty("PinCodeValue"));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("SelectCountry"))).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("RegionState"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("Continue1"))).click();
		
		
	}
}