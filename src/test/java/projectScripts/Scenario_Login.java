package projectScripts;

import java.io.IOException;
import java.util.Map;

import genericLibrary.Base_Class99;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageFactory.PF_Home_Page;
import pageFactory.PF_Login_Page;

public class Scenario_Login extends Base_Class99 {
	public Logger Logr=Logger.getLogger(Base_Class99.class);
	
	@Test(dataProvider="dp_Invalidlogin",dataProviderClass=dataProvider.DataProvider99.class)
	public void testInvalidLogin(Map<String,String> login) throws IOException
	{
		String Uname = login.get("Uname");
		String Pwd = login.get("Pwd");
		String EXP_RESULT = login.get("exp_msg");
		
		String TC_ID = login.get("TC_ID");
		String Order = login.get("Order");
		
		Logr.info("Executing the Test Case "+TC_ID+ " Order is "+Order);
		
		starttest=ereports.startTest(TC_ID);
		starttest.log(LogStatus.PASS, "Executing the Test case "+TC_ID+ "Order is " +Order);
		
		PF_Home_Page home_page = new PF_Home_Page(driver);
		home_page.Click_Login();
		
		PF_Login_Page login_page = new PF_Login_Page(driver);
		login_page.cl_login(Uname, Pwd);
		
		String ACT_RESULT = login_page.getInvalidmsg();
		if(ACT_RESULT.equals(EXP_RESULT))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_RESULT );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_RESULT+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_RESULT );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_RESULT+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		
		}
	}
	
	
	
	@Test(dataProvider="dp_Validlogin",dataProviderClass=dataProvider.DataProvider99.class)
	public void testValidLogin(Map<String,String> login) throws IOException
	{
		String Uname = login.get("Uname");
		String Pwd = login.get("Pwd");
		String EXP_RESULT = login.get("exp_msg");
		
		String TC_ID = login.get("TC_ID");
		String Order = login.get("Order");
		
		Logr.info("Executing the Test Case "+TC_ID+ " Order is "+Order);
		
		starttest=ereports.startTest(TC_ID);
		starttest.log(LogStatus.PASS, "Executing the Test case "+TC_ID+ "Order is " +Order);
		
		
		
		PF_Home_Page home_page = new PF_Home_Page(driver);
		home_page.Click_Login();
		
		PF_Login_Page login_page = new PF_Login_Page(driver);
		login_page.cl_login(Uname, Pwd);
		
		String ACT_RESULT = home_page.getValidmsg();
		if(ACT_RESULT.equals(EXP_RESULT))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_RESULT );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_RESULT+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_RESULT );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_RESULT+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
	}
}
