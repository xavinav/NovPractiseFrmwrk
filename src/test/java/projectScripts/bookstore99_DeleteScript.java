package projectScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bookstore99_DeleteScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver ff = new FirefoxDriver();
		
		ff.get("http://www.99bookstore.com/");
        ff.manage().window().maximize();
        
        ff.findElement(By.linkText("Login")).click();
        
        ff.findElement(By.id("email")).sendKeys("anand.naveen906@gmail.com");
        ff.findElement(By.id("pass")).sendKeys("Naveen@123");
        ff.findElement(By.className("input-checkbox")).click();
        
        ff.findElement(By.id("send2")).click();
        
        ff.findElement(By.xpath(".//*[@id='top-checkout-area']/div[2]/div[1]/a")).click();
        
        ff.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr[1]/td[7]/a")).click();
        ff.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[7]/a")).click();
        
        String OTP = ff.findElement(By.xpath(".//*[@id='page']/div/div[2]/div[1]/div/div[2]/h1")).getText();
        System.out.println(OTP);
        
        ff.findElement(By.linkText("here")).click();
        
        ff.findElement(By.linkText("Logout")).click();
        
        ff.close();
        
        
        
		
		
		
	}

}
