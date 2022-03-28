package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
private WebDriver driver;
	
	@BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
 
    @Test
    public void test() {
    	WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		
		username.sendKeys("root");
		password.sendKeys("pa$$w0rd");
		
		WebElement login = driver.findElement(By.id("wp-submit"));
		login.click();
		
		WebElement joblist = driver.findElement(By.xpath("//*[@id=\"menu-posts-job_listing\"]/a/div[3]"));
		joblist.click();
		
		WebElement addnew = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[4]/a"));
		addnew.click();
		
		WebElement position = driver.findElement(By.id("post-title-0"));
		position.sendKeys("TestM1");
		
		WebElement publish = driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-panel__toggle editor-post-publish-button__button is-primary']"));
		publish.click();
		
		WebElement publish2 = driver.findElement(By.xpath("//button[@class='components-button editor-post-publish-button editor-post-publish-button__button is-primary']"));
		publish2.click();
		
		//WebElement viewjob = driver.findElement(By.linkText("TestM1"));
		WebElement viewjob = 
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[2]/div/div[1]/a"));
		

		viewjob.click();
		
		String role = driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]")).getText();
        Assert.assertEquals(role, "TestM1");
		
		
		
       }
 
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
		
	

}
