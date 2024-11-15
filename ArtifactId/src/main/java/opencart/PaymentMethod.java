package opencart;

import org.openqa.selenium.By;

public class PaymentMethod extends OpencartURL
{
    public void payment_Meth() throws Exception
    {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pro.getProperty("Checkboxp"))).click();
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(pro.getProperty("Continue4"))).click();
    }
}
