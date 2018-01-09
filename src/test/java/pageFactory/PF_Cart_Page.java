package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Cart_Page {

    //Success msg validation - Added to your shopping cart
	@FindBy(xpath=".//*[@id='page']/div/div[2]/div[1]/div/div[3]/ul/li/ul/li/span")
	public WebElement msg_ARAddedtocart;
	
	
	//Clicking Continue Shopping button  - Cart_Page
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")
	public WebElement btncontshoppingAR;
    
	//Success msg validation - Added to your shopping cart
	@FindBy(xpath=".//*[@id='page']/div/div[2]/div[1]/div/div[3]/ul/li/ul/li/span")
	public WebElement msg_DWAddedtocart;
	
    
    //Clicking Continue Shopping button  - Cart_Page
    
    @FindBy(xpath=".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")
	public WebElement btncontshoppingDW;
    
    //Deletion of AR book
    
    @FindBy(xpath=".//*[@id='shopping-cart-table']/tbody/tr[1]/td[7]/a")
	public WebElement Icon_rmvAR;
    
    //Deletion of DW book
    
    @FindBy(xpath=".//*[@id='shopping-cart-table']/tbody/tr/td[7]/a")
	public WebElement Icon_rmvDW;
    
    //EmptyCart Label in Cart page
    
    @FindBy(xpath=".//*[@id='page']/div/div[2]/div[1]/div/div[2]/h1")
	public WebElement lbl_emptycart;
    
    //Navigation link to Homepage
    @FindBy(linkText="here")
	public WebElement lnk_CarttoHome; 
    
    
    
    public String Addedtocartmsg_AR()
    {
    	return msg_ARAddedtocart.getText();
    }
    
    public String Addedtocartmsg_DW()
    {
    	return msg_DWAddedtocart.getText();
    }
    
    //Method for Deletion of AR book
    
	public void DeleteAR()
	{
		Icon_rmvAR.click();
	}
    
    //Method for Deletion of DW book
	
	public void DeleteDW()
	{
		Icon_rmvDW.click();
	}
	
	//Extracting cart msg after Deletion
	public String Getcartmsg_AfterDeletion()
    {
		return lbl_emptycart.getText();
   }
	
	//Navigation to Homepage
	public void NavigateHomePage()
	{
		lnk_CarttoHome.click();
	}
    
    public PF_Cart_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
}
    
}
