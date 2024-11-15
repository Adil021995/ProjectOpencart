package opencart;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpencartURL
{
   public static WebDriver driver;
   public String driverPath = "F:\\ALL STUDY FILES\\Chrome-Driver\\Driver\\chromedriver-win64\\chromedriver.exe";
   public File src;
   public FileInputStream fis;
   public static Properties pro;
   public static JavascriptExecutor jse;
   
   public void openUrlOfopencart() throws Exception
   {
	   OpencartURL obj = new OpencartURL();
	   src = new File("F:\\New Project(2024)opencart\\Eclipse-Workspace-Project2024\\ArtifactId\\Orepository.properties");
	   fis = new FileInputStream(src);
	   pro = new Properties();
	   pro.load(fis);
	   
	   System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   obj.Url(driver, pro.getProperty("Url"));
   }
   
   public void Url(WebDriver driver , String Url)
   {
	   driver.get(Url);
   }
}
