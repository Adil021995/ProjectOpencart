package opencart;

import org.openqa.selenium.By;

public class TrackOrder extends OpencartURL
{
    public void trackOrder() throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pro.getProperty("Myaccount2"))).click();
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(pro.getProperty("TrackOrderl"))).click();
    	
    	Thread.sleep(3000);
    	driver.quit();
    }
}