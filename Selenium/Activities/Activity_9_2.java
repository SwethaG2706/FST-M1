package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity_9_2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		Select multilist = new Select(driver.findElement(By.id("multi-select")));
		
		if(multilist.isMultiple()) {
			multilist.selectByVisibleText("Javascript");
			System.out.println(chosen.getText());
			
			multilist.selectByValue("node");
			System.out.println(chosen.getText());
			
			for(int i=4; i<=6; i++) {
			multilist.selectByIndex(i);
			}
			System.out.println(chosen.getText());
			
			multilist.deselectByValue("node");
			System.out.println(chosen.getText());
			
			multilist.deselectByIndex(7);
			System.out.println(chosen.getText());
			
			
			WebElement firstOption = multilist.getFirstSelectedOption();
			System.out.println("Selected first option: " + firstOption);
			
			List<WebElement> selectedOptions = multilist.getAllSelectedOptions();
			for(WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }
            
            //Deselect all options
            multilist.deselectAll();
            System.out.println(chosen.getText());
        }        
        //Close browser
        //driver.close();
			
			
			
			
			
			
			
		}
		
	}


