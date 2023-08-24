package Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import facebook.Base;

public class Email extends Base{
	@Test
	public static void nameTest() throws Exception {
		Thread.sleep(4000);	 
	     WebElement usernameTxt = driver.findElement(By.id("email"));
	     if(usernameTxt.isDisplayed()) {
	        	if(usernameTxt.isEnabled()) {
	        		usernameTxt.sendKeys("Revanth");
	        		String enteredText = usernameTxt.getAttribute("value");
	        		System.out.println(enteredText);
	        		
	        		Thread.sleep(3000);
	        	}
	        	else
	        	    System.err.println("Name textbox is not enabled");
	        }
	        else
	        	System.err.println("Name textbox is not displayed");
		}

 
}
