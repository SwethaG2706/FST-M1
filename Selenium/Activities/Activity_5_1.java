package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page tile is " +pagetitle);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The checkbox Input is displayed: " + checkbox.isDisplayed());
				
		WebElement removecheckbox = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		System.out.println("The checkbox Input is displayed: " + removecheckbox.isDisplayed());
		
		driver.close();
	}

}
