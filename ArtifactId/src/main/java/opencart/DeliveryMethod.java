package opencart;

import org.openqa.selenium.By;

public class DeliveryMethod extends OpencartURL
{
    public void deliveryMethod() throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pro.getProperty("Textarea2"))).sendKeys(pro.getProperty("Textarea2Value"));
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pro.getProperty("Continue3"))).click();
    }
}
