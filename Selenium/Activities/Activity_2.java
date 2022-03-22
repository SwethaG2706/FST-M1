package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class Activity_2 {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net");
			String title = driver.getTitle();
			System.out.println("Page Tile is "+title);
			
			WebElement id = driver.findElement(By.id("about-link"));
			String idtext = id.getText();
			System.out.println("ID Text content is : " + idtext);
									
			WebElement classlocator = driver.findElement(By.className("green"));
			String classtext = classlocator.getText();
			System.out.println("Class Text content is : " + classtext);
						
			WebElement linktext = driver.findElement(By.linkText("About Us"));
			String link = linktext.getText();
			System.out.println("Link Text content is : " + link);
			
			WebElement css = driver.findElement(By.cssSelector(".green"));
			String csstext = css.getText();
			System.out.println("Css Text content is : " + csstext);
									
			driver.close();
		}

	}


