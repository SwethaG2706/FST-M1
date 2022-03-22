package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Page Tile is :" +title);
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		
		firstname.sendKeys("Swetha");
		lastname.sendKeys("Gaddam");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement contact = driver.findElement(By.id("number"));
		
		email.sendKeys("gs@gmail.com");
		contact.sendKeys("9986754321");
		
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
				
		driver.close();	
		
		
	}

}
