package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Cart_Page {

    //Clicking Continue Shopping button  - Cart_Page
	
	@FindBy(xpath=".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")
	public WebElement btncontshoppingAR;
    
    
    //Clicking Continue Shopping button  - Cart_Page
    
    @FindBy(xpath=".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")
	public WebElement btncontshoppingDW;
    
    public PF_Cart_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
}
    
}
