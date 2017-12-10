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
    
    
  //Selecting the displayed book - Home_Page
	@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")
	public WebElement img_bookAngryRiver;
            
  //Clicking Adding to cart - Home_Page
    @FindBy(xpath=".//*[@id='product_addtocart_form']/div[3]/div[7]/div[1]/img")
	public WebElement btn_addcartAR;

    
  //Selecting the displayed book - Home_Page
	@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")
	public WebElement img_bookDaretowin;
    
   
  //Clicking Adding to cart - Home_Page
	@FindBy(xpath=".//*[@id='product_addtocart_form']/div[3]/div[6]/div[1]/img")
	public WebElement btn_addcartDW;

    
    //Clicking Logout button  - Home_Page
	@FindBy(linkText="Logout")
	public WebElement lnktxt_Logout;
    
	//1st section
	public PF_Home_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
		
	public void Click_Login()
		    {
		     lnktxt_Login.click();
	}
	
	public String getValidmsg()
	{
		return msg_Valid.getText();
	}

}
