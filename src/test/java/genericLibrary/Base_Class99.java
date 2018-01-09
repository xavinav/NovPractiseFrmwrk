package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base_Class99 {
	
	public WebDriver driver;
	public static ExtentReports ereports;
	public ExtentTest starttest;
	
	Utility_Class99 c1 = new Utility_Class99();
	
	@BeforeMethod
	public void launchApp() throws Exception{
		
        String browsertype = c1.Reading_properties("BTYPE");
        if (browsertype.equals("firefox"))
        {
        driver =new FirefoxDriver();
        }
        else if(browsertype.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","D:\\Framework_Practise\\Drivers\\ChromeDriver\\chromedriver.exe");
        	driver =new ChromeDriver();
        	}
        else if(browsertype.equals("ie"))
        {
        System.setProperty("webdriver.ie.driver","D:\\Framework_Practise\\Drivers\\IEDriver\\IEDriverServer.exe");
        driver =new InternetExplorerDriver();
        }
		
		driver.get(c1.Reading_properties("URL"));
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
}
	
	
	public String Capture_Screenshot(String TC_ID,String Order) throws IOException
	{
		

        Date date= new Date();
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String str=df.format(date)+".png";
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		String path ="D:\\Framework_Practise\\Snapshots\\"+TC_ID+"-"+Order+"-"+str + ".png";
		FileUtils.copyFile(screenshotAs, new File(path));
		
		return path;
	}
	
	@BeforeSuite()
	public void Report_Extent()
	{
	Date date=new Date();
	SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
    String str=df.format(date);

	ereports= new ExtentReports("D:\\Framework_Practise\\Reports\\"+"99bookstore"+"-"+str+".html");
	}
	
	@AfterMethod
	public void tearDown(){		
		driver.quit();
		
		ereports.endTest(starttest);
		ereports.flush();
	}

	
	
}
