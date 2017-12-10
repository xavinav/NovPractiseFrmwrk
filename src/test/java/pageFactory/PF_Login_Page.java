package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Login_Page {
	

	
    //Entering credentials and clicking login button - Login_Page
	@FindBy(id="email")
	public WebElement txt_email;
    
	@FindBy(id="pass")
	public WebElement txt_pwd;
    
	@FindBy(className="input-checkbox")
	public WebElement chkbox_rememberme;
    
	@FindBy(id="send2")
	public WebElement btn_login;
	
	//Displaying error msg after unsuccessful login
	@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div/div/ul/li/ul/li/span")
	public WebElement msg_Invalid;
	
	
	
	
    
	public PF_Login_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
		  
}
	
	public void cl_login(String Uname, String Pwd)
	{
	
		txt_email.sendKeys(Uname);
		txt_pwd.sendKeys(Pwd);
		chkbox_rememberme.click();
		btn_login.click();
	}
	
	public String getInvalidmsg()
	{
		return msg_Invalid.getText();
	}
	

}

