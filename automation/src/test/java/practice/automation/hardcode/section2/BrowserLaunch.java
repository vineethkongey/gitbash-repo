package practice.automation.hardcode.section2;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	
	public void launch(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		driver.get("https://google.com");
		
		
	}
	

}
