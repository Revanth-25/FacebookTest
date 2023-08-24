package facebook;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	   public static WebDriver driver;
	   public static Properties prop = new Properties();
	   public static FileReader fr;
	    @BeforeTest
       public void setUp() throws IOException {
    	   
    			WebDriverManager.chromedriver().setup();  //base
    			driver = new ChromeDriver(); 
    			driver.manage().window().maximize();
    			driver.get("https://www.facebook.com/");
    	   
       }
	    @AfterTest
	       public void tearDown() {
	    	   driver.close();
	    	
	       }
}
