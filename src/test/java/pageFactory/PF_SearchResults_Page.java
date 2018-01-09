package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_SearchResults_Page {

	  //Selecting the displayed book - Home_Page
		@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")
		public WebElement img_bookAngryRiver;
		
		  //Selecting the displayed book - Home_Page
		@FindBy(xpath=".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")
		public WebElement img_bookDaretowin;
		
		public void clickbookAR()
		{
			img_bookAngryRiver.click();;
		}
		
		public void clickbookDW()
		{
			img_bookDaretowin.click();;
		}
		
		public PF_SearchResults_Page(WebDriver driver){
			PageFactory.initElements(driver, this);
}

}