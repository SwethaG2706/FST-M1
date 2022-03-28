package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
private WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
 
    @Test
    public void test() {
        
        String heading2 = driver.findElement(By.xpath("//h2")).getText();
            
        
        System.out.println("Heading is: " + heading2);
            
            //Assertion for page title
        Assert.assertEquals("Quia quis non", heading2);
                    
       }
 
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
		


}
