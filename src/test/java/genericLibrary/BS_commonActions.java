package genericLibrary;

import org.openqa.selenium.WebElement;

public class BS_commonActions {
	
	public static void EnterValue(WebElement ele,String val){
		ele.clear();
		ele.sendKeys(val);	
	}
	
	public static void click(WebElement ele){
		ele.click();		
	}

}
