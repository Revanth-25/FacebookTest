package Details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import facebook.Base;

public class password extends Base {
	
     @Test
	public static void passwordTest() throws Exception {
		
		Thread.sleep(4000);	 
	     WebElement passTxt = driver.findElement(By.id("pass"));
	 if(passTxt.isDisplayed()) {
     	if(passTxt.isEnabled()) {
     		passTxt.sendKeys("mypassword");
     		String enteredText = passTxt.getAttribute("value");
     		
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
