package opencart;

import org.openqa.selenium.By;

public class ConfirmOrder extends OpencartURL
{
    public void confirmOrder() throws Exception
    {
    	Thread.sleep(2000);
    	jse.executeScript("window.scrollBy(0 , 200)");
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(pro.getProperty("Continue5"))).click();
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(pro.getProperty("Continue6"))).click();
    	
    }
}