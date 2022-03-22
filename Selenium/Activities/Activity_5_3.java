package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page tile is " +pagetitle);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("The textbox is enabled: " + textbox.isEnabled());
		
		WebElement enableInput = driver.findElement(By.xpath("//button[@id='toggleInput']"));
		enableInput.click();
		System.out.println("After clicking the enable input " + textbox.isEnabled());
				
		driver.close();
		
	}

}
