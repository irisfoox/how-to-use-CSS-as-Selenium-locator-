package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/Selenium/Drivers/chrome79/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/newtours");
	    driver.manage().window().maximize();
	    WebDriverWait waitVar=new WebDriverWait(driver,10);
	    //waitVar.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[id='display_country']")));

	    try {
	  	    
	        WebElement userName=driver.findElement(By.name("userName"));
	    	userName.sendKeys("tutorial");
	    	WebElement pass=driver.findElement(By.name("password"));  
	        pass.sendKeys("tutorial");
	        WebElement submit=driver.findElement(By.cssSelector("[type='submit'][name='submit']"));
	        submit.click();
	        waitVar.until(ExpectedConditions.urlContains("http://demo.guru99.com/test/newtours/login_sucess.php"));
		    
		    WebElement fly=driver.findElement(By.cssSelector("[href='reservation.php\'][style='margin-left: 5px;color: #0000ee;text-decoration: underline;']"));
	        fly.click();
	        WebElement oneWay=driver.findElement(By.cssSelector("[name='tripType'][value='oneway']"));
	        oneWay.click();
	        WebElement first=driver.findElement(By.cssSelector("[name='servClass'][value='First']"));
	        first.click();
	        WebElement con=driver.findElement(By.cssSelector("[name='findFlights']"));
	        con.click();
	        
	        waitVar.wait(5000);
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	}

}
