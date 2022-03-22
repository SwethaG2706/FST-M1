package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_7_1 {
public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page title is "+pagetitle);
		
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password')]"));
		
		username.sendKeys("admin");
		password.sendKeys("password");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='ui button']"));
		loginbutton.click();
		
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login message: " + loginMessage);
		
		driver.close();
		
		
		
		

	}
}
