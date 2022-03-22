package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String pagetitle = driver.getTitle();
		System.out.println("Page tile is " +pagetitle);
		
		WebElement aboutus = driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
		aboutus.click();
		
		String newpagetitle = driver.getTitle();
		System.out.println("New Page tile is " +newpagetitle);
	}

}
