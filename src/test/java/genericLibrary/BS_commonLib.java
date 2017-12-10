package genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BS_commonLib {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchApp() throws Exception{
		driver = new FirefoxDriver();
		driver.get(getProp("url"));
		driver.manage().window().maximize();		
	}
	
	@AfterMethod
	public void tearDown(){		
		driver.quit();	
	}
		
		//Utility method
		public static String getProp(String key) throws Exception{
			
		     FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\Settings.properties");
				
		     Properties prop = new Properties();	
		     prop.load(fis);
		     	
		    return prop.getProperty(key);	
	}

}
