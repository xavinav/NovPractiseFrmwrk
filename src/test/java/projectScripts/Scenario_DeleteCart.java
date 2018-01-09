package projectScripts;

import java.io.IOException;
import java.util.Map;

import genericLibrary.Base_Class99;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageFactory.PF_Cart_Page;
import pageFactory.PF_Home_Page;
import pageFactory.PF_Login_Page;



import com.relevantcodes.extentreports.LogStatus;

public class Scenario_DeleteCart extends Base_Class99 {

	public Logger Logr=Logger.getLogger(Base_Class99.class);
	
	
	@Test(dataProvider="dp_DeleteCart",dataProviderClass=dataProvider.DataProvider99.class)
	public void testDeleteCart(Map<String,String> delete) throws IOException
	{
		
		String EXP_MSG1 = delete.get("Expmsg1");
		String Uname = delete.get("Uname");
		String Pwd = delete.get("Pwd");
		String EXP_MSG2 = delete.get("Expmsg2");
		
		String TC_ID = delete.get("TC_ID");
		String Order = delete.get("Order");
		
		Logr.info("Executing the Test Case "+TC_ID+ " Order is "+Order);
		
		starttest=ereports.startTest(TC_ID);
		starttest.log(LogStatus.PASS, "Executing the Test case "+TC_ID+ "Order is " +Order);
		
		PF_Home_Page home_page = new PF_Home_Page(driver);
		PF_Login_Page login_page = new PF_Login_Page(driver);
		PF_Cart_Page cart_page = new PF_Cart_Page(driver);
		
		
		home_page.Click_Login();
		
		login_page.cl_login(Uname, Pwd);
		
		String ACT_RESULT = home_page.getValidmsg();
		if(ACT_RESULT.equals(EXP_MSG2))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG2 );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG2 );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		
		//Goto cartpage
		home_page.Goto_cart();
		
		//Deletion of items in Cart
		
		cart_page.DeleteAR();
		cart_page.DeleteDW();
		
		//EmptyCart msg extraction
		
		String CART_MSG = cart_page.Getcartmsg_AfterDeletion();
		if(CART_MSG.equals(EXP_MSG1))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+CART_MSG+ " Expected Result is "+EXP_MSG1 );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+CART_MSG+ " Expected Result is " +EXP_MSG1+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+CART_MSG+ " Expected Result is "+EXP_MSG1 );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+CART_MSG+ " Expected Result is " +EXP_MSG1+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		
		//Clicking gotohome link
		cart_page.NavigateHomePage();
		

				
		//Clicking Logout link in Home Page
				home_page.Click_logout();
		
		
	}

}
