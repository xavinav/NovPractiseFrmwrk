package projectScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinearScript_rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FirefoxDriver ff = new FirefoxDriver();
		
		//Launching URL - Home_Page
        ff.get("http://www.99bookstore.com/");
        ff.manage().window().maximize();
        
      //Clicking on Login link - Home_Page
        ff.findElement(By.linkText("Login")).click();
        
      //Entering credentials and clicking login button - Login_Page
        ff.findElement(By.id("email")).sendKeys("anand.naveen906@gmail.com");
        ff.findElement(By.id("pass")).sendKeys("Naveen@123");
        ff.findElement(By.className("input-checkbox")).click();
        ff.findElement(By.id("send2")).click();
        
        String Cart_Total_Item = ff.findElement(By.partialLinkText("items")).getText();
        System.out.println(Cart_Total_Item);
        
        ff.close();
        
        
        	}

}
