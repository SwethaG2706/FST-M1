package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page tile is " +pagetitle);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The checkbox Input is selected: " + checkbox.isSelected());
		checkbox.click();
		
		System.out.println("After clicking, The checkbox Input is selected: " + checkbox.isSelected());
				
		driver.close();
		
	}

}
