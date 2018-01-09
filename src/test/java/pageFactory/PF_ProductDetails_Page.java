package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_ProductDetails_Page {

	
	  //Clicking Adding to cart - Home_Page
    @FindBy(xpath=".//*[@id='product_addtocart_form']/div[3]/div[7]/div[1]/img")
	public WebElement btn_addcartAR;
    
   
  //Clicking Adding to cart - Home_Page
	@FindBy(xpath=".//*[@id='product_addtocart_form']/div[3]/div[6]/div[1]/img")
	public WebElement btn_addcartDW;
	
	
	
	public PF_ProductDetails_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
}

}
