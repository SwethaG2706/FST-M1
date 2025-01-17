package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.get("https://training-support.net/selenium/dynamic-controls");
		
			String pagetitle = driver.getTitle();
			System.out.println("Page title is "+pagetitle);
			
			 WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		     WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		     
		     toggleCheckboxButton.click();
		     
		     wait.until(ExpectedConditions.invisibilityOf(checkbox));
		     
		     toggleCheckboxButton.click();
		        
		        //Wait for checkbox to appear
		        wait.until(ExpectedConditions.visibilityOf(checkbox));
		        checkbox.click();
		        
		        //Close browser
		        driver.close();
		
		
	}

}
