package opencart;

import org.openqa.selenium.By;

public class DeliveryDetails extends OpencartURL
{
    public void delivery_Meth() throws Exception
    {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath(pro.getProperty("Continue2"))).click();
    }
}
