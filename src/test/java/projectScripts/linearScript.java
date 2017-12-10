package projectScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linearScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FirefoxDriver ff = new FirefoxDriver();
		
/*		ff.get("https://www.booksmela.com/");
		ff.manage().window().maximize();
		
		ff.findElement(By.xpath("//div[@id='navbar']/div/div/a[3]/span ")).click();
		
	
		//ff.findElement(By.name("login[username]")).sendKeys("anand.naveen906@gmail.com");
		
		//ff.findElement(By.xpath(".//*[@id='email']")).sendKeys("anand.naveen906@gmail.com");
		ff.findElement(By.xpath("//input[@id='email'][@title='Email Address']")).sendKeys("anand.naveen906@gmail.com");
		//ff.findElement(By.id("email")).sendKeys("anand.naveen906@gmail.com");
*/
		
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
        
      //Entering book search keyword - Home_Page
        ff.findElement(By.id("search")).sendKeys("Angry River");
        ff.findElement(By.id("searchsubmit")).click();
        
      //Selecting the displayed book - Home_Page
        ff.findElement(By.xpath(".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")).click();
                
      //Clicking Adding to cart - Home_Page
        ff.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[3]/div[7]/div[1]/img")).click();
      
      //Clicking Continue Shopping button  - Cart_Page
        ff.findElement(By.xpath(".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")).click();
        
        
      //Entering book search keyword - Home_Page
        ff.findElement(By.id("search")).sendKeys("Dare to win");
        ff.findElement(By.id("searchsubmit")).click();
        
      //Selecting the displayed book - Home_Page
        ff.findElement(By.xpath(".//*[@id='page']/div/div[3]/div[1]/div[2]/div[2]/ul/li[1]/a/img")).click();
       
      //Clicking Adding to cart - Home_Page
        ff.findElement(By.xpath(".//*[@id='product_addtocart_form']/div[3]/div[6]/div[1]/img")).click();
       
      //Clicking Continue Shopping button  - Cart_Page
        ff.findElement(By.xpath(".//*[@id='shopping-cart-table']/tfoot/tr/td/button[1]")).click();
        
        Thread.sleep(5000);
       
      //Clicking Logout button  - Home_Page
        ff.findElement(By.linkText("Logout")).click();
       
      //Closing app - Home_Page
        ff.close();
        
        
        
        
        
        
        
        
        
        
        
	}

}

