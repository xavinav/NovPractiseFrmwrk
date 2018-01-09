package projectScripts;

import java.io.IOException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import pageFactory.PF_Cart_Page;
import pageFactory.PF_Home_Page;
import pageFactory.PF_Login_Page;
import pageFactory.PF_ProductDetails_Page;
import pageFactory.PF_SearchResults_Page;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.Base_Class99;

public class Scenario_Search_Addtocart extends Base_Class99 {
	public Logger Logr=Logger.getLogger(Base_Class99.class);
	
	@Test(priority = 1, dataProvider="dp_BookValidSearch",dataProviderClass=dataProvider.DataProvider99.class)
	public void testValidSearch(Map<String,String> search) throws IOException, InterruptedException
	{
		String Search1 = search.get("Search1");
		String EXP_MSG1 = search.get("Expmsg1");
		String Search2 = search.get("Search2");
		String EXP_MSG2 = search.get("Expmsg2");
		String Uname = search.get("Uname");
		String Pwd = search.get("Pwd");
		String EXP_MSG3 = search.get("Expmsg3");
		
		String TC_ID = search.get("TC_ID");
		String Order = search.get("Order");
		
		Logr.info("Executing the Test Case "+TC_ID+ " Order is "+Order);
		
		
		starttest=ereports.startTest(TC_ID);
		starttest.log(LogStatus.PASS, "Executing the Test case "+TC_ID+ "Order is " +Order);
		
		PF_Home_Page home_page = new PF_Home_Page(driver);
		PF_Login_Page login_page = new PF_Login_Page(driver);
		PF_SearchResults_Page searchrslt_page = new PF_SearchResults_Page(driver);
		PF_ProductDetails_Page pdp_page = new PF_ProductDetails_Page(driver);
		PF_Cart_Page cart_page = new PF_Cart_Page(driver);
		
		
		home_page.Click_Login();
		
		login_page.cl_login(Uname, Pwd);
		
		String ACT_RESULT = home_page.getValidmsg();
		if(ACT_RESULT.equals(EXP_MSG3))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG3 );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_MSG3+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG3 );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+ACT_RESULT+ " Expected Result is " +EXP_MSG3+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		
		//Searching book in Home Page
		home_page.booksearch(Search1);
		
		//Clicking on desired book in searchresults page
		searchrslt_page.clickbookAR();
		
		//Clicking on Addtocart button in productdetails page
		pdp_page.btn_addcartAR.click();
		
		//Extracting successmsg from Cartpage
		String AR_SUCCESSMSG = cart_page.Addedtocartmsg_AR();
		
		if(AR_SUCCESSMSG.equals(EXP_MSG1))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual cart message is "+AR_SUCCESSMSG+ " Expected cart message is "+EXP_MSG1 );
			starttest.log(LogStatus.PASS, "Passed as the Actual cart message is "+AR_SUCCESSMSG+ " Expected cart message is" +EXP_MSG1+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual cart message is "+AR_SUCCESSMSG+ " Expected cart message is "+EXP_MSG1 );
			starttest.log(LogStatus.PASS, "Failed as the Actual cart message is "+AR_SUCCESSMSG+ " Expected cart message is" +EXP_MSG1+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));	
			
		}
		
		//Clicking Continue Shopping button in Cart_Page
		cart_page.btncontshoppingAR.click();
		
		//Searching book in Home Page
		home_page.booksearch(Search2);
		
		//Clicking on desired book in searchresults page
		searchrslt_page.clickbookDW();
		
		//Clicking on Addtocart button in productdetails page
		pdp_page.btn_addcartDW.click();
		
		//Extracting successmsg from Cartpage
		String DW_SUCCESSMSG = cart_page.Addedtocartmsg_DW();
		
		if(DW_SUCCESSMSG.equals(EXP_MSG2))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual cart message is "+DW_SUCCESSMSG+ " Expected cart message is "+EXP_MSG2 );
			starttest.log(LogStatus.PASS, "Passed as the Actual cart message is "+DW_SUCCESSMSG+ " Expected cart message is" +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual cart message is "+DW_SUCCESSMSG+ " Expected cart message is "+EXP_MSG2 );
			starttest.log(LogStatus.PASS, "Failed as the Actual cart message is "+DW_SUCCESSMSG+ " Expected cart message is" +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));	
			
		}		
		
		//Clicking Continue Shopping button in Cart_Page
				cart_page.btncontshoppingDW.click();
				
		//Clicking Logout link in Home Page
				home_page.Click_logout();
		
		
	}
	
	@Test(priority = 2, dataProvider="dp_CartValidation",dataProviderClass=dataProvider.DataProvider99.class)
	public void testCartValidation(Map<String,String> cartv) throws IOException
	{
		
		String EMPTY_CART_MSG = cartv.get("Expmsg1");
		String EXP_MSG2 = cartv.get("Expmsg2");
		String Uname = cartv.get("Uname");
		String Pwd = cartv.get("Pwd");
		String EXP_MSG3 = cartv.get("Expmsg3");
		
		String TC_ID = cartv.get("TC_ID");
		String Order = cartv.get("Order");

        Logr.info("Executing the Test Case "+TC_ID+ " Order is "+Order);
		
		starttest=ereports.startTest(TC_ID);
		starttest.log(LogStatus.PASS, "Executing the Test case "+TC_ID+ "Order is " +Order);
		
		PF_Home_Page home_page = new PF_Home_Page(driver);
		PF_Login_Page login_page = new PF_Login_Page(driver);
		
        home_page.Click_Login();
		
		login_page.cl_login(Uname, Pwd);
		
		String ACT_RESULT = home_page.getValidmsg();
		if(ACT_RESULT.equals(EXP_MSG3))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG3 );
			starttest.log(LogStatus.PASS, "Passed as Actual result is "+ACT_RESULT+ " Expected Result is - " +EXP_MSG3+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		else 
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual Result is "+ACT_RESULT+ " Expected Result is "+EXP_MSG3 );
			starttest.log(LogStatus.FAIL, "Failed as Actual result is "+ACT_RESULT+ " Expected Result is - " +EXP_MSG3+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
			
			
		}
		String ACT_TOTAL = home_page.GetCart_Totalitem();
		if(!ACT_TOTAL.equals(EMPTY_CART_MSG))
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Passed as the Actual total item in cart is "+ACT_TOTAL+ " It is not same as msg - "+EMPTY_CART_MSG );
			starttest.log(LogStatus.PASS, "Passed as Actual total item in cart is "+ACT_TOTAL+ " It is not same as msg - " +EMPTY_CART_MSG+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
		}
		else
		{
			//Capture_Screenshot(TC_ID, Order);
			Logr.info("Failed as the Actual total item in cart is "+ACT_TOTAL+ " It is same as msg - "+EMPTY_CART_MSG );
			starttest.log(LogStatus.FAIL, "Failed as the Actual total item in cart is "+ACT_TOTAL+ " It is same as msg - " +EMPTY_CART_MSG+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
		}
		//Clicking Logout in home page
		home_page.Click_logout();
		
		//Validating logout msg
		String EXP_CART_MSG = home_page.Getcartmsg_Afterlogout();
		if(EXP_CART_MSG.equals(EXP_MSG2))
		{
			Logr.info("Passed as the expected cart message is "+EXP_CART_MSG+ " Expected Cart message is - "+EXP_MSG2 );
			starttest.log(LogStatus.PASS, "Passed as the expected cart message is "+EXP_CART_MSG+ " Expected Cart message is - " +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));
		}
		else
		{
			Logr.info("Failed as the expected cart message is "+EXP_CART_MSG+ " Expected Cart message is - "+EXP_MSG2 );
			starttest.log(LogStatus.FAIL, "Failed as the expected cart message is "+EXP_CART_MSG+ " Expected Cart message is - " +EXP_MSG2+starttest.addScreenCapture(Capture_Screenshot(TC_ID, Order)));	
		}
		
	}

}
