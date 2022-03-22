package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is "+pagetitle);
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		WebElement number = driver.findElement(By.xpath("//*[@id=\"number\"]"));
		
		firstname.sendKeys("Swetha");
		lastname.sendKeys("Gaddam");
		email.sendKeys("gs@gmail.com");
		number.sendKeys("9986754321");
		
		WebElement submit = driver.findElement(By.xpath("//input[contains(@class, 'green')]"));
		submit.click();
				
		driver.close();	
		
		
	}

}
