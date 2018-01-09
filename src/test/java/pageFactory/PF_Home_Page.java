package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Home_Page {
	
	//Clicking on Login link - Home_Page
	
	@FindBy(linkText="Login")
	public WebElement lnktxt_Login;
	
	//Displaying success msg after successful login
	@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div[1]/div/div/div[2]/p[1]/strong")
	public WebElement msg_Valid;
	
	
    //Entering book search keyword - Home_Page
	
	@FindBy(id="search")
	public WebElement txt_Search;
    
	@FindBy(id="searchsubmit")
	public WebElement btn_Submit;
	
	@FindBy(partialLinkText="items")
	public WebElement cart_Total_Items;
	
    //Clicking Logout button  - Home_Page
	@FindBy(linkText="Logout")
	public WebElement lnktxt_Logout;
	
	//Extracting Empty Cart message once after logout in Home page
	@FindBy(xpath=".//*[@id='top-checkout-area']/div[2]/div[1]")
	public WebElement Emptycartmsg_Logout;
	
	//Cartnavigation in home page
	@FindBy(xpath=".//*[@id='top-checkout-area']/div[2]/div[1]/a")
	public WebElement lnktxt_Cartwithitems;
	
	public void Click_Login()
    {
     lnktxt_Login.click();
   }

     public String getValidmsg()
  {
     return msg_Valid.getText();
  }
	
	public void booksearch(String Searchbookname)
	{
		txt_Search.sendKeys(Searchbookname);
		btn_Submit.click();
	}
    
    //Extracting Cart total items
	 public String GetCart_Totalitem()
	 {
		 return cart_Total_Items.getText();
	 }
	
    //Click Logout
	public void Click_logout()
    {
     lnktxt_Logout.click();
   }
    
	//Extracting cart msg after logout
	public String Getcartmsg_Afterlogout()
    {
		return Emptycartmsg_Logout.getText();
   }
	
	//Clicking on cart link from Homepage
	public void Goto_cart()
	{
		lnktxt_Cartwithitems.click();
	}
	
	//1st section
	public PF_Home_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		

	


}
