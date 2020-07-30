package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello1 {
	
	
	
		@Test
		void test1() {

			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\anton\\eclipseWS\\test1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			 System.out.println(driver.getCurrentUrl());
			  System.out.println(driver.getTitle());
			 driver.close();
		}
	}


